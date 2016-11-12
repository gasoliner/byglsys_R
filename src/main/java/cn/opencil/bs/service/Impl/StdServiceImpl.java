package cn.opencil.bs.service.Impl;

import cn.opencil.bs.mapper.BsStudentMapper;
import cn.opencil.bs.po.BsStudent;
import cn.opencil.bs.service.StdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wanhongji on 2016/11/3.
 */

public class StdServiceImpl implements StdService {
    @Autowired
    BsStudentMapper bsStudentMapper;

    public void insertStd(BsStudent student) throws Exception {
        bsStudentMapper.insert(student);
    }

    public void deleteStd(Long id) throws Exception {
        bsStudentMapper.deleteByPrimaryKey(id);
    }

    public void updateStd(BsStudent student) throws Exception {
        bsStudentMapper.updateByPrimaryKey(student);
    }

    public BsStudent selectStdById(Long id) throws Exception {
        return bsStudentMapper.selectByPrimaryKey(id);
    }
}
