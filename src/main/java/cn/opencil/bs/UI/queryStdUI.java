package cn.opencil.bs.UI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wanhongji on 2016/11/10.
 * 转到queryStd页面的
 */
@Controller
@RequestMapping("/UI")
public class queryStdUI
{
    @RequestMapping("/queryStd")
    public String queryStd_ui(){
        return "queryStd";
    }
}
