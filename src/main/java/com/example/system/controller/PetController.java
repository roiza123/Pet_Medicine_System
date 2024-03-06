package com.example.system.controller;

import com.example.system.pojo.Hospital;
import com.example.system.pojo.Pet;
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
public class PetController {

    @Autowired
    private PetService petService;

    //新增宠物信息
    @RequestMapping(value = "addPet",method = RequestMethod.POST)
    public void addPet(@RequestBody Pet petRequest) {
        //获取表单数据
       String pName = petRequest.getPName();
       String pIntroduce = petRequest.getPIntroduce();
       String pAddress = petRequest.getPAddress();
       String pPhotosLink = petRequest.getPPhotosLink();
       Integer petKeeperId = petRequest.getPetKeeperId();
       String petKeeperPhone = petRequest.getPetKeeperPhone();
       String pType = petRequest.getPType();
       petService.addPet(pName,pIntroduce,pAddress,pPhotosLink,petKeeperId,petKeeperPhone,pType);
    }

    //删除宠物信息
    @RequestMapping(value = "deletePet",method = RequestMethod.GET)
    public void deletePet(Integer id){
        petService.deletePet(id);
    }

    //修改宠物信息
    @RequestMapping(value = "updatePet",method = RequestMethod.POST)
    public void updatePet(@RequestBody Pet petRequest){
        //获取表单数据
        Integer id = petRequest.getId();
        String pName = petRequest.getPName();
        String pIntroduce = petRequest.getPIntroduce();
        String pAddress = petRequest.getPAddress();
        String pPhotosLink = petRequest.getPPhotosLink();
        Integer petKeeperId = petRequest.getPetKeeperId();
        String petKeeperPhone = petRequest.getPetKeeperPhone();
        String pType = petRequest.getPType();
        petService.updatePet(id,pName,pIntroduce,pAddress,pPhotosLink,petKeeperId,petKeeperPhone,pType);
    }

    //查找宠物信息（宠物主人）
    @RequestMapping(value = "searchPet1",method = RequestMethod.POST)
    public List<Pet> searchPet1(Integer petKeeperId){
        return petService.searchPet1(petKeeperId);
    }

    //查找宠物信息（医疗方面）
    @RequestMapping(value = "searchPet2",method = RequestMethod.POST)
    public Pet searchPet2(Integer id){
        return petService.searchPet2(id);
    }
    }