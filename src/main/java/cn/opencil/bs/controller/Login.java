package cn.opencil.bs.controller;

import cn.opencil.bs.po.TeacherEx;
import cn.opencil.bs.service.UserList;
import cn.opencil.bs.vo.TeacherVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by wanhongji on 2016/11/10.
 */
@Controller
public class Login {
    @Autowired
    private UserList userList;
    @RequestMapping("/login")
    public String login(HttpSession session, TeacherVo teacherVo) throws Exception {

        List<TeacherEx> list=userList.queryUserList(teacherVo);
        if(!list.isEmpty()){
            String username=new String(list.get(0).getStdname());
            session.setAttribute("username",username);
            System.out.println(username+"已经登录了");
            return "redirect:index.jsp";
        }else{
            return "login";
        }
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session)throws Exception{
        session.invalidate();
        return "redirect:index.jsp";
    }
}
