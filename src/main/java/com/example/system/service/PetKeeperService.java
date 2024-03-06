package com.example.system.service;

import com.example.system.pojo.Pet;
import com.example.system.pojo.PetKeeper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PetKeeperService {

    //检验养宠人登录
    PetKeeper ifRightPetKeeper(@Param("pkUsername") String pkUsername, @Param("pkPassword") String pkPassword);

    //增加养宠人
    void addPetKeeper(@Param("pkName") String pkName, @Param("pkUsername") String pkUsername, @Param("pkPassword") String pkPassword, @Param("pkPhone") String pkPhone, @Param("pkAddress") String pkAddress);

    //删除养宠人
    void deletePetKeeper(@Param("id") Integer id);

    //修改养宠人信息
    void updatePetKeeper(@Param("id")Integer id, @Param("pkName") String pkName, @Param("pkUsername") String pkUsername, @Param("pkPassword") String pkPassword, @Param("pkPhone") String pkPhone, @Param("pkAddress") String pkAddress);

    //检验是否存在
    PetKeeper ifHave(@Param("pkUsername")String pkUsername);
}