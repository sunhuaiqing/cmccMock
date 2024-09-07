package com.example.demo;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

import static com.example.demo.CmccMockApplication.logger;

@RestController
public class DemoController {
    //读取application.properties配置文件
    @Value("${demo.name}")
    String demo_name;
    @Value("${demo.switch}")
    String demo_switch;

    @PostMapping("/index")
    public HashMap<String, Object> index(@RequestBody User user, HttpServletRequest request) {
        //获取请求参数：
        String name = user.getUserName();
        int age = Integer.parseInt(user.getAge());
        String token = user.getToken();
        Map<String, String> datainfo = user.getDatainfo();
        String vbs_env_no = datainfo.get("vbs_env_no");
        String bid = datainfo.get("bid");
        //组装返回报文
        HashMap<String, Object> responseBody = new HashMap<>();
        String returnCode = "";
        String message = "";
        HashMap<String, Object> data = new HashMap<>();
        if (age < 36) {
            returnCode = "0000";
            message = "你的年龄小于35岁，很适合，返回0000！！";
        } else {
            returnCode = "9999";
            message = "你的年龄已经大于35岁，不适合，返回9999";
        }
        data.put("vbs_env_no", vbs_env_no);
        data.put("bid", bid);
        data.put("name", name);
        data.put("age", age);
        data.put("token", token);
        data.put("demo_name", demo_name);
        data.put("demo_switch", demo_switch);
        responseBody.put("returnCode", returnCode);
        responseBody.put("message", message);
        responseBody.put("data", data);
        logger.info("http请求报文:" + user);
        logger.info("http响应报文:" + responseBody);
        return responseBody;
    }

    @RequestMapping("/test1")
    public String test() {
        return "test";
    }


    @GetMapping("/user")
    public String testUser() {
        return "userInfo";
    }


}
