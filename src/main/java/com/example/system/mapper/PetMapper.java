package com.example.system.mapper;

import com.example.system.pojo.Hospital;
import com.example.system.pojo.Pet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PetMapper {

    //添加宠物
    void addPet(@Param("pName") String pName, @Param("pIntroduce") String pIntroduce, @Param("pAddress") String pAddress, @Param("pPhotosLink") String pPhotosLink, @Param("petKeeperId") Integer petKeeperId, @Param("petKeeperPhone") String petKeeperPhone, @Param("pType") String pType);

    //删除宠物
    void deletePet(@Param("id") Integer id);

    //修改宠物信息
    void updatePet(@Param("id")Integer id,@Param("pName") String pName, @Param("pIntroduce") String pIntroduce, @Param("pAddress") String pAddress, @Param("pPhotosLink") String pPhotosLink, @Param("petKeeperId") Integer petKeeperId, @Param("petKeeperPhone") String petKeeperPhone, @Param("pType") String pType);

    //查找宠物（宠物主人
    List<Pet> searchPet1(@Param("petKeeperId") Integer petKeeperId);

    //查找宠物（医疗端
    Pet searchPet2(@Param("id") Integer id);
}