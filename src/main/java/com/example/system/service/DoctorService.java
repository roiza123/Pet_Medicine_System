package com.example.system.service;

import com.example.system.pojo.Doctor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DoctorService {

    //增加医生信息
    void addDoctor(@Param("dName")String dName, @Param("dUsername")String dUsername, @Param("dPassword") String dPassword, @Param("dHospital")String dHospital, @Param("dPhone")String dPhone, @Param("dIntroduce")String dIntroduce, @Param("dIntroducePhotosLink")String dIntroducePhotosLink);

    //删除医生信息
    void deleteDoctor(@Param("id")Integer id);

    //修改医生信息
    void updateDoctor(@Param("id")Integer id,@Param("dName")String dName,@Param("dUsername")String dUsername,@Param("dPassword") String dPassword,@Param("dHospital")String dHospital,@Param("dPhone")String dPhone,@Param("dIntroduce")String dIntroduce,@Param("dIntroducePhotosLink")String dIntroducePhotosLink);

    //查询医生信息（宠物医疗机构端）
    List<Doctor> searchDoctor1(@Param("dHospital")String dHospital);

    //验证医生登录信息
    Doctor ifRight(String dUsername, String dPassword);

    //查询医生信息（兽医端）
    Doctor searchDoctor2(@Param("id")Integer id);

    //是否存在这个医生
    Doctor ifHave(String dUsername);
}