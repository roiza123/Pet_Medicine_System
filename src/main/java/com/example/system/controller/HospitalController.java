package com.example.system.controller;

import com.example.system.pojo.Doctor;
import com.example.system.pojo.Hospital;
import com.example.system.service.DoctorService;
import com.example.system.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    //验证医院登录信息
    @RequestMapping(value = "ifRightHospital",method =RequestMethod.POST)
    public Hospital ifRightHospital(String hUsername,String hPassword){
        return hospitalService.ifRightHospital(hUsername,hPassword);
    }

    //新增医院信息
    @RequestMapping(value = "addHospital",method = RequestMethod.POST)
    public void addHospital(@RequestBody Hospital hospitalRequest) {
        //获取表单数据
        String hName = hospitalRequest.getHName();
        String hUsername = hospitalRequest.getHUsername();
        String hPassword = hospitalRequest.getHPassword();
        String hWorkTime = hospitalRequest.getHWorkTime();
        String hPhone = hospitalRequest.getHPhone();
        String hAddress = hospitalRequest.getHAddress();
        String hIntroduce = hospitalRequest.getHIntroduce();
        String hIntroducePhotosLink = hospitalRequest.getHIntroducePhotosLink();
        Integer hEvaluation = hospitalRequest.getHEvaluation();
        hospitalService.addHospital(hName,hUsername,hPassword,hWorkTime,hPhone,hAddress,hIntroduce,hIntroducePhotosLink,hEvaluation);
    }

    //删除医院信息
    @RequestMapping(value = "deleteHospital",method = RequestMethod.GET)
    public void deleteHospital(Integer id){
        hospitalService.deleteHospital(id);
    }

    //修改医院信息
    @RequestMapping(value = "updateHospital",method = RequestMethod.POST)
    public void updateHospital(@RequestBody Hospital hospitalRequest){
        //获取表单数据
        Integer id = hospitalRequest.getId();
        String hName = hospitalRequest.getHName();
        String hUsername = hospitalRequest.getHUsername();
        String hPassword = hospitalRequest.getHPassword();
        String hWorkTime = hospitalRequest.getHWorkTime();
        String hPhone = hospitalRequest.getHPhone();
        String hAddress = hospitalRequest.getHAddress();
        String hIntroduce = hospitalRequest.getHIntroduce();
        String hIntroducePhotosLink = hospitalRequest.getHIntroducePhotosLink();
        Integer hEvaluation = hospitalRequest.getHEvaluation();
        hospitalService.updateHospital(id,hName,hUsername,hPassword,hWorkTime,hPhone,hAddress,hIntroduce,hIntroducePhotosLink,hEvaluation);
    }

    //查找医院信息
    @RequestMapping(value = "searchHospital",method = RequestMethod.POST)
    public List<Hospital> searchHospital(String key){
        return hospitalService.searchHospital(key);
    }
    }