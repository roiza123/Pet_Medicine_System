package com.example.system.service.impl;

import com.example.system.mapper.HospitalMedicalServiceMapper;
import com.example.system.mapper.MedicalServiceMapper;
import com.example.system.model.HospitalMedicalService;
import com.example.system.pojo.Hospital;
import com.example.system.pojo.MedicalService;
import com.example.system.service.HospitalMedicalServiceService;
import com.example.system.service.MedicalServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HospitalMedicalServiceServiceImpl implements HospitalMedicalServiceService {

    @Autowired
    private HospitalMedicalServiceMapper hospitalMedicalServiceMapper;


    @Override
    public List<HospitalMedicalService> searchMedicalService2(String keyword) {
        return hospitalMedicalServiceMapper.searchMedicalService2(keyword);
    }

    @Override
    public List<HospitalMedicalService> searchHospitalService(String keyword) {
        return hospitalMedicalServiceMapper.searchHospitalService(keyword);
    }
}