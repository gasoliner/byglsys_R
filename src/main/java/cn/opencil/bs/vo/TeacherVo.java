package cn.opencil.bs.vo;

import cn.opencil.bs.po.BsStudent;
import cn.opencil.bs.po.TeacherEx;

/**
 * Created by wanhongji on 2016/11/10.
 */
public class TeacherVo {
    public BsStudent bsStudent;
    public TeacherEx teacherEx;

    public BsStudent getBsStudent() {
        return bsStudent;
    }

    public void setBsStudent(BsStudent bsStudent) {
        this.bsStudent = bsStudent;
    }

    public TeacherEx getTeacherEx() {
        return teacherEx;
    }

    public void setTeacherEx(TeacherEx teacherEx) {
        this.teacherEx = teacherEx;
    }
}
