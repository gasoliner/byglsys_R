package cn.opencil.bs.controller;

import cn.opencil.bs.po.BsStudent;
import cn.opencil.bs.service.StdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by wanhongji on 2016/11/4.
 */
@Controller
public class StdController {
    @Autowired
    private StdService stdService;

    @RequestMapping("/queryStd")
    public String queryStdControl(HttpServletResponse response,HttpSession session, Long sid) throws Exception {
        response.setCharacterEncoding("utf-8");
        BsStudent students= stdService.selectStdById(sid);
        System.out.println("kfjsakldfjskldfj");
        session.setAttribute("students",students);
        return "redirect:/UI/queryStd";
    }
}
