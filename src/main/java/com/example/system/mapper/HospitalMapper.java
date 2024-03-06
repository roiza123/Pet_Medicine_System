package com.example.system.mapper;

import com.example.system.pojo.Doctor;
import com.example.system.pojo.Hospital;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HospitalMapper {

    //医院登录
    Hospital ifRightHospital(@Param("hUsername") String hUsername, @Param("hPassword") String hPassword);

    //新增医院
    void addHospital(@Param("hName")String hName, @Param("hUsername")String hUsername,@Param("hPassword")String hPassword, @Param("hWorkTime")String hWorkTime, @Param("hPhone")String hPhone, @Param("hAddress")String hAddress, @Param("hIntroduce")String hIntroduce, @Param("hIntroducePhotosLink")String hIntroducePhotosLink,@Param("hEvaluation")Integer hEvaluation);

    //如果医院已经注册了
    Hospital ifHave(@Param("hName") String hName, @Param("hUsername") String hUsername);

    //注销医院
    void deleteHospital(@Param("id") Integer id);

    //修改医院信息
    void updateHospital(@Param("id")Integer id,@Param("hName")String hName, @Param("hUsername")String hUsername,@Param("hPassword")String hPassword, @Param("hWorkTime")String hWorkTime, @Param("hPhone")String hPhone, @Param("hAddress")String hAddress, @Param("hIntroduce")String hIntroduce, @Param("hIntroducePhotosLink")String hIntroducePhotosLink,@Param("hEvaluation")Integer hEvaluation);

    //医院搜索
    List<Hospital> searchHospital(@Param("key") String key);
}