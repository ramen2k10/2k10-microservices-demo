package com.propertiesservice.service;

import java.util.List;

import com.propertiesservice.model.PropertiesInfo;

public interface PropertyService {
    public List<PropertiesInfo> getPropertyInfoById(Long id);
}
