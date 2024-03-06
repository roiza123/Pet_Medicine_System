package com.example.system.controller;

import com.example.system.pojo.Hospital;
import com.example.system.pojo.Pet;
import com.example.system.pojo.PetKeeper;
import com.example.system.service.PetKeeperService;
import com.example.system.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class PetKeeperController {

    @Autowired
    private PetKeeperService petKeeperService;

    //验证医院登录信息
    @RequestMapping(value = "ifRightPetKeeper",method =RequestMethod.POST)
    public PetKeeper ifRightPetKeeper(String pkUsername, String pkPassword){
        return petKeeperService.ifRightPetKeeper(pkUsername,pkPassword);
    }

    //新增宠物主人信息
    @RequestMapping(value = "addPetKeeper",method = RequestMethod.POST)
    public void addPetKeeper(@RequestBody PetKeeper petKeeperRequest) {
        //获取表单数据
        String pkName = petKeeperRequest.getPkName();
        String pkUsername = petKeeperRequest.getPkUsername();
        String pkPassword = petKeeperRequest.getPkPassword();
        String pkPhone = petKeeperRequest.getPkPhone();
        String pkAddress = petKeeperRequest.getPkAddress();
        petKeeperService.addPetKeeper(pkName,pkUsername,pkPassword,pkPhone,pkAddress);
    }

    //删除宠物主人信息
    @RequestMapping(value = "deletePetKeeper",method = RequestMethod.GET)
    public void deletePetKeeper(Integer id){
        petKeeperService.deletePetKeeper(id);
    }

    //修改宠物主人信息
    @RequestMapping(value = "updatePetKeeper",method = RequestMethod.POST)
    public void updatePet(@RequestBody PetKeeper petKeeperRequest){
        //获取表单数据
        Integer id = petKeeperRequest.getId();
        String pkName = petKeeperRequest.getPkName();
        String pkUsername = petKeeperRequest.getPkUsername();
        String pkPassword = petKeeperRequest.getPkPassword();
        String pkPhone = petKeeperRequest.getPkPhone();
        String pkAddress = petKeeperRequest.getPkAddress();
        petKeeperService.updatePetKeeper(id,pkName,pkUsername,pkPassword,pkPhone,pkAddress);
    }

}