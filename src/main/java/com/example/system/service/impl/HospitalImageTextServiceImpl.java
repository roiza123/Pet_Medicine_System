package com.example.system.service.impl;

import com.example.system.mapper.HospitalImageTextMapper;
import com.example.system.model.HospitalImageText;
import com.example.system.service.HospitalImageTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalImageTextServiceImpl implements HospitalImageTextService {

    @Autowired
    private HospitalImageTextMapper hospitalImageTextMapper;

    @Override
    public List<HospitalImageText> searchImageText2(String keyword) {
        return hospitalImageTextMapper.searchImageText2(keyword);
    }
}