package com.example.system.controller;

import com.example.system.pojo.ImageText;
import com.example.system.pojo.MedicalService;
import com.example.system.service.ImageTextService;
import com.example.system.service.MedicalServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class MedicalServiceController {

    @Autowired
    private MedicalServiceService medicalServiceService;

    //新增医疗服务信息
    @RequestMapping(value = "addMedicalService",method = RequestMethod.POST)
    public int addMedicalService(@RequestBody MedicalService medicalServiceRequest) {
        //获取表单数据
       Integer hId = medicalServiceRequest.getHId();
       String msTitle = medicalServiceRequest.getMsTitle();
       String msIntroduce = medicalServiceRequest.getMsIntroduce();
       Integer msPrice = medicalServiceRequest.getMsPrice();
       String msIntroducePhotosLink = medicalServiceRequest.getMsIntroducePhotosLink();
        if(msIntroduce.length()<=256){
            medicalServiceService.addMedicalService(hId,msTitle,msIntroduce,msPrice,msIntroducePhotosLink);
            return 1;
        }else {
            return 0 ;
        }
    }

    //删除医疗服务信息
    @RequestMapping(value = "deleteMedicalService",method = RequestMethod.GET)
    public void deleteMedicalService(Integer id){
        medicalServiceService.deleteMedicalService(id);
    }

    //修改医疗服务信息
    @RequestMapping(value = "updateMedicalService",method = RequestMethod.POST)
    public int updateMedicalService(@RequestBody MedicalService medicalServiceRequest){
        //获取表单数据
        Integer id = medicalServiceRequest.getId();
        String msTitle = medicalServiceRequest.getMsTitle();
        String msIntroduce = medicalServiceRequest.getMsIntroduce();
        Integer msPrice = medicalServiceRequest.getMsPrice();
        String msIntroducePhotosLink = medicalServiceRequest.getMsIntroducePhotosLink();
        if(msIntroduce.length()<=256){
            medicalServiceService.updateMedicalService(id,msTitle,msIntroduce,msPrice,msIntroducePhotosLink);
            return 1;
        }else {
            return 0 ;
        }
    }

    //查找医疗服务信息（医疗机构端）
    @RequestMapping(value = "searchMedicalService1",method = RequestMethod.POST)
    public List<MedicalService> searchMedicalService1(Integer hId){
        return medicalServiceService.searchMedicalService1(hId);
    }

}