package cn.opencil.bs.service.Impl;

import cn.opencil.bs.mapper.TeacherMapper;
import cn.opencil.bs.po.TeacherEx;
import cn.opencil.bs.service.UserList;
import cn.opencil.bs.vo.TeacherVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by wanhongji on 2016/11/10.
 */
public class UserListImpl implements UserList {
    @Autowired
    private TeacherMapper teacherMapper;

    public List<TeacherEx> queryUserList(TeacherVo teacherVo) throws Exception {
        return teacherMapper.queryUserList(teacherVo);
    }
}
