package cn.opencil.bs.service;

import cn.opencil.bs.po.BsStudent;

/**
 * Created by wanhongji on 2016/11/3.
 */
public interface StdService {

    /**
     *增加一名学生
     * */
    void insertStd(BsStudent student)throws Exception;

    /**
     *删除一名学生（by id）
     * */
    void deleteStd(Long id)throws Exception;

    /**
     *修改（by id）
     * */
    void updateStd(BsStudent student)throws Exception;

    /**
     *查询（by id）
     * */
    BsStudent selectStdById(Long id)throws Exception;

    /**
     *
     * */
}
