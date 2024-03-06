package com.example.system.mapper;

import com.example.system.model.HospitalMedicalService;
import com.example.system.pojo.MedicalService;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HospitalMedicalServiceMapper {

    //查找医疗服务信息
    List<HospitalMedicalService> searchMedicalService2(@Param("keyword") String keyword);

    List<HospitalMedicalService> searchHospitalService(@Param("keyword") String keyword);
}