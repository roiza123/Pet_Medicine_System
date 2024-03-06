package com.example.system.mapper;

import com.example.system.pojo.Pet;
import com.example.system.pojo.PetKeeper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PetKeeperMapper {

    //验证养宠人登录
    PetKeeper ifRightPetKeeper(@Param("pkUsername") String pkUsername, @Param("pkPassword") String pkPassword);

    //添加养宠人
    void addPetKeeper(@Param("pkName") String pkName, @Param("pkUsername") String pkUsername, @Param("pkPassword") String pkPassword, @Param("pkPhone") String pkPhone, @Param("pkAddress") String pkAddress);

    //删除养宠人
    void deletePetKeeper(@Param("id") Integer id);

    //更新养宠人信息
    void updatePetKeeper(@Param("id") Integer id,@Param("pkName") String pkName, @Param("pkUsername") String pkUsername, @Param("pkPassword") String pkPassword, @Param("pkPhone") String pkPhone, @Param("pkAddress") String pkAddress);

    //查看养宠人是否已经存在
    PetKeeper ifHave(@Param("pkUsername") String pkUsername);
}