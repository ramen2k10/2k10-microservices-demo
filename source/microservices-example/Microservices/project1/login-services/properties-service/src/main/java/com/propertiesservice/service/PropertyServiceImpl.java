package com.propertiesservice.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.propertiesservice.model.PropertiesInfo;

@Service
public class PropertyServiceImpl implements PropertyService{

    List<PropertiesInfo> listProppertiesInfo = List.of(
        new PropertiesInfo(1123L, "Realstate", "2020", "20L", 111L),
        new PropertiesInfo(1143L, "Plot", "2020", "60L", 112L),
        new PropertiesInfo(1163L, "Gold", "2022", "40L", 111L),
        new PropertiesInfo(1163L, "Car", "2021", "30L", 1114L),
        new PropertiesInfo(1183L, "Home", "2023", "40L", 112L)
    );

    @Override
    public List<PropertiesInfo> getPropertyInfoById(Long id) {
        return this.listProppertiesInfo.stream().filter(propertiesInfo->propertiesInfo.getOwnerId().equals(id)).collect(Collectors.toList());
    }
    
}
