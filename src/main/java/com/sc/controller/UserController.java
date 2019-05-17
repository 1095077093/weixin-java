package com.sc.controller;
import com.alibaba.fastjson.JSON;
import com.sc.entity.User;
import com.sc.service.UserService;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/getUserByOpenId")
    public User getUserByOpenId(String openId){
        User user = userService.getUserByOpenId(openId);
        System.out.println(user);
        return user;
    }


    @GetMapping("/login")
    public User login(String code) throws IOException {
        System.out.println(code);
        String appId = "wx0d3fabbc69673cf2";
        String appSecret = "baed1fd4571aa79f570f38055645469b";
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + appId + "&secret=" + appSecret + "&js_code=" + code + "&grant_type=authorization_code";
        //System.out.println(url);

        CloseableHttpClient httpclient = HttpClients.createDefault();
        String result = null;
        try{
            HttpGet httpGet = new HttpGet(url);

            result = httpclient.execute(httpGet, new ResponseHandler<String>() {
                @Override
                public String handleResponse(HttpResponse httpResponse) throws ClientProtocolException, IOException {

                    int status = httpResponse.getStatusLine().getStatusCode();
                    //System.out.println("status=" + status);

                    if (status >= 200 && status < 300) {
                        HttpEntity entity = httpResponse.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Unexpected response status: " + status);
                    }
                }
            });
        }finally {
            httpclient.close();
        }

        //System.out.println(result);

        Map map = JSON.parseObject(result, Map.class);
       // System.out.println(map.get("openid"));


        User user = userService.getUserByOpenId(map.get("openid").toString());
        //System.out.println(user);
        if(user!=null){
            return user;
        }else{
            return new User(map.get("openid").toString());
        }

    }

    @GetMapping("/addUser")
    public String addUser(User user){
       System.out.println("===");
        System.out.println(user);
        userService.addUser(user);
        return "ok";
    }
}
