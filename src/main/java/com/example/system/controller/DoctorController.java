package com.example.system.controller;

import com.example.system.pojo.Doctor;
import com.example.system.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@ResponseBody
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

//  添加兽医信息
    @RequestMapping(value = "addDoctor",method = RequestMethod.POST)
    public void addDoctor(@RequestBody Doctor doctorRequest){
        //获取表单数据
        String dName = doctorRequest.getDName();
        String dUsername = doctorRequest.getDUsername();
        String dPassword = doctorRequest.getDPassword();
        String dHospital = doctorRequest.getDHospital();
        String dPhone = doctorRequest.getDPhone();
        String dIntroduce= doctorRequest.getDIntroduce();
        String dIntroducePhotosLink = doctorRequest.getDIntroducePhotosLink();
        doctorService.addDoctor(dName,dUsername,dPassword,dHospital,dPhone,dIntroduce,dIntroducePhotosLink);
    }

//  删除兽医信息
    @RequestMapping(value = "deleteDoctor",method = RequestMethod.GET)
    public void deleteDoctor(Integer id){
        doctorService.deleteDoctor(id);
    }

//  修改兽医信息
    @RequestMapping(value ="updateDoctor",method = RequestMethod.POST)
    public void updateDoctor(@RequestBody Doctor doctorRequest){
        Integer id = doctorRequest.getId();
        String dName = doctorRequest.getDName();
        String dUsername = doctorRequest.getDUsername();
        String dPassword = doctorRequest.getDPassword();
        String dHospital = doctorRequest.getDHospital();
        String dPhone = doctorRequest.getDPhone();
        String dIntroduce= doctorRequest.getDIntroduce();
        String dIntroducePhotosLink = doctorRequest.getDIntroducePhotosLink();
        doctorService.updateDoctor(Integer.valueOf(id),dName,dUsername,dPassword,dHospital,dPhone,dIntroduce,dIntroducePhotosLink);
    }

//  查询兽医信息(宠物医院端)
    @RequestMapping(value = "searchDoctor1",method = RequestMethod.POST)
    public List<Doctor> searchDoctor1(String dHospital){
        return doctorService.searchDoctor1(dHospital);
    }

//  查询兽医信息（兽医端）
    @RequestMapping(value = "searchDoctor2",method = RequestMethod.POST)
    public Doctor searchDoctor2(@RequestParam Integer id){
        return doctorService.searchDoctor2(id);
    }

    //验证兽医登录信息
    @RequestMapping(value = "ifRightDoctor",method = RequestMethod.POST)
    public Doctor ifRight(String dUsername,String dPassword){
        return doctorService.ifRight(dUsername,dPassword);
    }


}