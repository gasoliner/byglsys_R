package test;

import cn.opencil.bs.mapper.TeacherMapper;
import cn.opencil.bs.po.BsStudent;
import cn.opencil.bs.po.TeacherEx;
import cn.opencil.bs.service.StdService;
import cn.opencil.bs.service.UserList;
import cn.opencil.bs.vo.TeacherVo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by wanhongji on 2016/11/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/applicationContext-*.xml")
public class StdServiceImplTest {
    @Autowired
    StdService stdService;
    @Autowired
    TeacherMapper teacherMapper;
    @Autowired
    UserList userList;

    @Test
    public void insertStd() throws Exception {
//        Assert.assertNotNull(testMapper.selectTest((long) 1));
        System.out.println(stdService.selectStdById((long) 1).getStdname());
    }

    @Test
    public void test()throws Exception{
        TeacherVo teacherVo=new TeacherVo();
        teacherVo.setBsStudent(new BsStudent());
        teacherVo.getBsStudent().setEmployeenum("888888");
        teacherVo.getBsStudent().setPassword("888888");
        List<TeacherEx> list=teacherMapper.queryUserList(teacherVo);
        System.out.println(list.get(0).getStdname()+" "+list.get(0).getPassword());
    }

    @Test
    public void test2()throws Exception{
        TeacherVo teacherVo=new TeacherVo();
        TeacherEx teacherEx=new TeacherEx();
        teacherEx.setPassword("888888");
        teacherEx.setEmployeenum("888888");
        teacherVo.setTeacherEx(teacherEx);

        List<TeacherEx> list=userList.queryUserList(teacherVo);

        System.out.println("teacherVo-employeenum :"+teacherVo.getTeacherEx().getEmployeenum());
        System.out.println("teacherVo-password :"+teacherVo.getTeacherEx().getPassword());

        System.out.println(list.isEmpty());
        System.out.println("list[0] :"+list.get(0).getStdname());
        System.out.println("list :"+list);
    }
}