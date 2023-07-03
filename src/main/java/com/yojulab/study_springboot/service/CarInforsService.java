package com.yojulab.study_springboot.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yojulab.study_springboot.dao.SharedDao;

@Service
public class CarInforsService {
    @Autowired
    SharedDao sharedDao;
    
    public Object selectDetail(String CAR_INFOR_ID){
        // Object getOne(String sqlMapId, Object dataMap)
        String sqlMapId = "CarInfors.selectByUID";
        HashMap dataMap = new HashMap<>();
        dataMap.put("CAR_INFOR_ID", CAR_INFOR_ID);

        Object result = sharedDao.getOne(sqlMapId, dataMap);
        return null;
    }
}
