package com.it.order.mapper.secondary;

import com.it.order.entity.Departments;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentsMapper {
    int deleteByPrimaryKey(String deptNo);

    int insert(Departments record);

    int insertSelective(Departments record);

    Departments selectByPrimaryKey(String deptNo);

    int updateByPrimaryKeySelective(Departments record);

    int updateByPrimaryKey(Departments record);
}