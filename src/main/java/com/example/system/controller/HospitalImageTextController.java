package com.example.system.controller;

import com.example.system.model.HospitalImageText;
import com.example.system.service.HospitalImageTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class HospitalImageTextController {

    @Autowired
    private HospitalImageTextService HospitalImageTextService;

    //查看图文信息（养宠人方面）
    @RequestMapping(value = "searchImageText2",method = RequestMethod.POST)
    public List<HospitalImageText> searchImageText2(String keyword){
        return HospitalImageTextService.searchImageText2(keyword);
    }

}