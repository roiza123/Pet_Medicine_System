package com.example.system.service;

import com.example.system.pojo.Doctor;
import com.example.system.pojo.Hospital;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HospitalService {

    //验证医院登录
    Hospital ifRightHospital(String dUsername, String dPassword);

    //新增医院信息
    void addHospital(@Param("hName")String hName, @Param("hUsername")String hUsername,@Param("hPassword")String hPassword, @Param("hWorkTime")String hWorkTime, @Param("hPhone")String hPhone, @Param("hAddress")String hAddress, @Param("hIntroduce")String hIntroduce, @Param("hIntroducePhotosLink")String hIntroducePhotosLink,@Param("hEvaluation")Integer hEvaluation);

    //查询是否已经存在医院账号
    Hospital ifHave(@Param("hName") String hName,@Param("hUsername") String hUsername);

    //删除医院信息
    void deleteHospital(@Param("id") Integer id);

    //更新医院信息
    void updateHospital(@Param("id")Integer id,@Param("hName")String hName, @Param("hUsername")String hUsername,@Param("hPassword")String hPassword, @Param("hWorkTime")String hWorkTime, @Param("hPhone")String hPhone, @Param("hAddress")String hAddress, @Param("hIntroduce")String hIntroduce, @Param("hIntroducePhotosLink")String hIntroducePhotosLink,@Param("hEvaluation")Integer hEvaluation);

    //寻找医院列表
    List<Hospital> searchHospital(@Param("key") String key);
}