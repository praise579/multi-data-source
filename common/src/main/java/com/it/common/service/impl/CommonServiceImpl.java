package com.it.common.service.impl;

import com.it.common.entity.Address;
import com.it.common.mapper.AddressMapper;
import com.it.common.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonServiceImpl implements CommonService {
    @Autowired
    AddressMapper addressMapper;

    @Override
    public Address getAddress(Short addressId) {
        return addressMapper.selectByPrimaryKey(addressId);
    }
}
