package com.example.system.controller;

import com.example.system.model.HospitalMedicalService;
import com.example.system.pojo.MedicalService;
import com.example.system.service.HospitalMedicalServiceService;
import com.example.system.service.MedicalServiceService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@Controller
@ResponseBody
public class HospitalMedicalServiceController {

    @Autowired
    private HospitalMedicalServiceService hospitalMedicalServiceService;

    //查找医疗服务信息（养宠人端）
    @RequestMapping(value = "test",method = RequestMethod.POST)
    public List<HospitalMedicalService> searchHospitalService2(@RequestParam String keyword){
        return hospitalMedicalServiceService.searchMedicalService2(keyword);
    }

    //查找医疗服务信息2（养宠人端）
    @RequestMapping(value = "searchHospitalService",method = RequestMethod.POST)
    public List<HospitalMedicalService> searchHospitalService( @PathVariable String keyword){
        return hospitalMedicalServiceService.searchHospitalService(keyword);
    }


}