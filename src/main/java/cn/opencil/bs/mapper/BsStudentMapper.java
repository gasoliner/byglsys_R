package cn.opencil.bs.mapper;

import cn.opencil.bs.po.BsStudent;
import cn.opencil.bs.po.BsStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BsStudentMapper {
    long countByExample(BsStudentExample example);

    int deleteByExample(BsStudentExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(BsStudent record);

    int insertSelective(BsStudent record);

    List<BsStudent> selectByExample(BsStudentExample example);

    BsStudent selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") BsStudent record, @Param("example") BsStudentExample example);

    int updateByExample(@Param("record") BsStudent record, @Param("example") BsStudentExample example);

    int updateByPrimaryKeySelective(BsStudent record);

    int updateByPrimaryKey(BsStudent record);

}