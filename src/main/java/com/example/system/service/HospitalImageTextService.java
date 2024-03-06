package com.example.system.service;

import com.example.system.model.HospitalImageText;
import com.example.system.pojo.Hospital;
import com.example.system.pojo.ImageText;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HospitalImageTextService {

    //查找图文信息（养宠人）
    List<HospitalImageText> searchImageText2(@Param("keyword")String keyword);
}