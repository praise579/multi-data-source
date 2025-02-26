package com.it.order.mapper.primary;

import com.it.order.entity.Actor;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ActorMapper {
    int deleteByPrimaryKey(Short actorId);

    int insert(Actor record);

    int insertSelective(Actor record);

    Actor selectByPrimaryKey(Short actorId);

    int updateByPrimaryKeySelective(Actor record);

    int updateByPrimaryKey(Actor record);
}