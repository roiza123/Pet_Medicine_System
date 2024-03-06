package com.example.system.service;

import com.example.system.pojo.Doctor;
import com.example.system.pojo.Pet;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PetService {
    //增加宠物信息
    void addPet(@Param("pName") String pName, @Param("pIntroduce") String pIntroduce, @Param("pAddress") String pAddress, @Param("pPhotosLink") String pPhotosLink, @Param("petKeeperId") Integer petKeeperId, @Param("petKeeperPhone") String petKeeperPhone, @Param("pType") String pType);

    //删除宠物信息
    void deletePet(@Param("id") Integer id);

    //修改宠物信息
    void updatePet(@Param("id") Integer id, @Param("pName") String pName, @Param("pIntroduce") String pIntroduce, @Param("pAddress") String pAddress, @Param("pPhotosLink") String pPhotosLink, @Param("petKeeperId") Integer petKeeperId, @Param("petKeeperPhone") String petKeeperPhone, @Param("pType") String pType);

    //查找宠物信息（宠物主人）
    List<Pet> searchPet1(@Param("petKeeperId") Integer petKeeperId);

    //查找宠物信息（医疗）
    Pet searchPet2(@Param("id") Integer id);

}