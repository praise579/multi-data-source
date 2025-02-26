package com.it.order.service.impl;

import com.it.common.entity.Address;
import com.it.common.service.CommonService;
import com.it.order.entity.Actor;
import com.it.order.mapper.primary.ActorMapper;
import com.it.order.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorServiceImpl implements ActorService {
    @Autowired
    CommonService commonService;
    @Autowired
    ActorMapper actorMapper;

    @Override
    public Actor getActorById(Short id) {
        Address address = commonService.getAddress(id);
        return actorMapper.selectByPrimaryKey(id);
    }
}
