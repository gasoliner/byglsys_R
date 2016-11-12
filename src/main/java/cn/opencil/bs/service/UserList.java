package cn.opencil.bs.service;

import cn.opencil.bs.po.TeacherEx;
import cn.opencil.bs.vo.TeacherVo;

import java.util.List;

/**
 * Created by wanhongji on 2016/11/10.
 */
public interface UserList {
    //查询UserList,通过teacherVo包装查询条件，可以实现多个查询功能
    public List<TeacherEx> queryUserList(TeacherVo teacherVo)throws Exception;
}
