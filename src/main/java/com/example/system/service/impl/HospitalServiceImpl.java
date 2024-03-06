package com.example.system.service.impl;

import com.example.system.mapper.DoctorMapper;
import com.example.system.mapper.HospitalMapper;
import com.example.system.pojo.Doctor;
import com.example.system.pojo.Hospital;
import com.example.system.service.DoctorService;
import com.example.system.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalMapper hospitalMapper;


    @Override
    public Hospital ifRightHospital(String hUsername, String hPassword) {
        return hospitalMapper.ifRightHospital(hUsername,hPassword);
    }

    @Override
    @Transactional
    public void addHospital(String hName, String hUsername, String hPassword, String hWorkTime, String hPhone, String hAddress, String hIntroduce, String hIntroducePhotosLink,Integer hEvaluation) {
        if(hospitalMapper.ifHave(hName,hUsername) == null){
            hospitalMapper.addHospital(hName,hUsername,hPassword,hWorkTime,hPhone,hAddress,hIntroduce, hIntroducePhotosLink,hEvaluation);
        }

    }

    @Override
    public Hospital ifHave(String hName, String hUsername) {
        return hospitalMapper.ifHave(hName,hUsername);
    }

    @Override
    public void deleteHospital(Integer id) {
        hospitalMapper.deleteHospital(id);
    }

    @Override
    public void updateHospital(Integer id,String hName, String hUsername, String hPassword, String hWorkTime, String hPhone, String hAddress, String hIntroduce, String hIntroducePhotosLink, Integer hEvaluation) {
        hospitalMapper.updateHospital(id,hName,hUsername,hPassword,hWorkTime,hPhone,hAddress,hIntroduce, hIntroducePhotosLink,hEvaluation);
    }

    @Override
    public List<Hospital> searchHospital(String key) {
        return hospitalMapper.searchHospital(key);
    }


}