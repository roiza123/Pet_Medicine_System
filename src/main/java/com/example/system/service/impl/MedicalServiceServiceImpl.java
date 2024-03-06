package com.example.system.service.impl;

import com.example.system.mapper.ImageTextMapper;
import com.example.system.mapper.MedicalServiceMapper;
import com.example.system.pojo.ImageText;
import com.example.system.pojo.MedicalService;
import com.example.system.service.ImageTextService;
import com.example.system.service.MedicalServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MedicalServiceServiceImpl implements MedicalServiceService {

    @Autowired
    private MedicalServiceMapper medicalServiceMapper;

    @Transactional
    @Override
    public void addMedicalService(Integer hId, String msTitle,String msIntroduce, Integer msPrice, String msIntroducePhotosLink) {
        medicalServiceMapper.addMedicalService(hId,msTitle,msIntroduce,msPrice,msIntroducePhotosLink);
    }

    @Override
    public void deleteMedicalService(Integer id) {
        medicalServiceMapper.deleteMedicalService(id);
    }

    @Override
    public void updateMedicalService(Integer id, String msTitle,String msIntroduce, Integer msPrice, String msIntroducePhotosLink) {
        medicalServiceMapper.updateMedicalService(id,msTitle,msIntroduce,msPrice,msIntroducePhotosLink);
    }

    @Override
    public List<MedicalService> searchMedicalService1(Integer hId) {
        return medicalServiceMapper.searchMedicalService1(hId);
    }

}