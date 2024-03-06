package com.example.system.service.impl;

import com.example.system.mapper.DoctorMapper;
import com.example.system.pojo.Doctor;
import com.example.system.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    @Transactional
    public void addDoctor(String dName, String dUsername, String dPassword, String dHospital, String dPhone, String dIntroduce, String dIntroducePhotosLink) {
        if(doctorMapper.ifHave(dUsername) == null){
            doctorMapper.addDoctor(dName,dUsername,dPassword,dHospital,dPhone,dIntroduce,dIntroducePhotosLink);
        }
    }

    @Override
    public void deleteDoctor(Integer id) {
        doctorMapper.deleteDoctor(id);
    }

    @Override
    public void updateDoctor(Integer id,String dName, String dUsername, String dPassword, String dHospital, String dPhone, String dIntroduce, String dIntroducePhotosLink) {
        doctorMapper.updateDoctor(id,dName,dUsername,dPassword,dHospital,dPhone,dIntroduce,dIntroducePhotosLink);
    }

    @Override
    public List<Doctor> searchDoctor1(String dHospital) {
        return doctorMapper.searchDoctor1(dHospital);
    }


    @Override
    public Doctor ifRight(String dUsername, String dPassword){
        return doctorMapper.ifRight(dUsername,dPassword);
    }

    @Override
    public Doctor searchDoctor2(Integer id) {
        return doctorMapper.searchDoctor2(id);
    }

    @Override
    public Doctor ifHave(String dUsername) {
        return doctorMapper.ifHave(dUsername);
    }


}