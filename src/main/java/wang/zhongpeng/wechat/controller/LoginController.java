package wang.zhongpeng.wechat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @RequestMapping("/login.do")
    public String login(String username, String password){
        System.out.println("登录");
        return "login";
    }

    @RequestMapping("/getInfo.do")
    @ResponseBody
    public int getInfo() {
        return 100;
    }
}
