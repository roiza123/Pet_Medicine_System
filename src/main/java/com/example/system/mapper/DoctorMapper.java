package com.example.system.mapper;

import com.example.system.pojo.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DoctorMapper {

    //查找医生信息(医疗机构)
    List<Doctor> searchDoctor1(String dHospital);

    //查找医生信息(兽医)
    Doctor searchDoctor2(@Param("id")Integer id);

    //添加医生信息
    void addDoctor(@Param("dName") String dName, @Param("dUsername") String dUsername, @Param("dPassword") String dPassword,@Param("dHospital")  String dHospital, @Param("dPhone") String dPhone, @Param("dIntroduce") String dIntroduce, @Param("dIntroducePhotosLink") String dIntroducePhotosLink);

    //医生登录
    Doctor ifRight(@Param("dUsername") String dUsername, @Param("dPassword") String dPassword);

    //删除医生
    void deleteDoctor(@Param("id") Integer id);

    //修改医生信息
    void updateDoctor(@Param("id") Integer id,@Param("dName") String dName, @Param("dUsername") String dUsername, @Param("dPassword") String dPassword,@Param("dHospital")  String dHospital, @Param("dPhone") String dPhone, @Param("dIntroduce") String dIntroduce, @Param("dIntroducePhotosLink") String dIntroducePhotosLink);

    //是否存在医生
    Doctor ifHave(@Param("dUsername") String dUsername);
}