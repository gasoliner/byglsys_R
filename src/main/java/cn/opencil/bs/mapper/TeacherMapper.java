package cn.opencil.bs.mapper;

import cn.opencil.bs.po.BsStudent;
import cn.opencil.bs.po.BsStudentExample;
import cn.opencil.bs.po.TeacherEx;
import cn.opencil.bs.vo.TeacherVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    List<TeacherEx> queryUserList(TeacherVo teacherVo)throws Exception;

}