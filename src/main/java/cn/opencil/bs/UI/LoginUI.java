package cn.opencil.bs.UI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wanhongji on 2016/11/10.
 * 转到login页面的
 */
@Controller
@RequestMapping("/UI")
public class LoginUI
{
    @RequestMapping("/login")
    public String login_ui(){
        return "login";
    }
}
