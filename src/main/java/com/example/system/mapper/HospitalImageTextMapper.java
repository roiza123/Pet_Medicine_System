package com.example.system.mapper;

import com.example.system.model.HospitalImageText;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HospitalImageTextMapper {

    //查找图文信息
    List<HospitalImageText>searchImageText2(@Param("keyword") String keyword);
}