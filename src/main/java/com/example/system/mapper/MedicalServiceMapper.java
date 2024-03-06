package com.example.system.mapper;

import com.example.system.pojo.MedicalService;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MedicalServiceMapper {
    //添加医疗服务
    void addMedicalService(@Param("hId") Integer hId, @Param("msTitle")String msTitle,@Param("msIntroduce") String msIntroduce, @Param("msPrice") Integer msPrice, @Param("msIntroducePhotosLink") String msIntroducePhotosLink);

    //删除医疗服务
    void deleteMedicalService(@Param("id") Integer id);

    //修改医疗服务信息
    void updateMedicalService(@Param("id") Integer id, @Param("msTitle")String msTitle,@Param("msIntroduce") String msIntroduce, @Param("msPrice") Integer msPrice, @Param("msIntroducePhotosLink") String msIntroducePhotosLink);

    //查找医疗服务信息
    List<MedicalService> searchMedicalService1(@Param("hId") Integer hId);

}