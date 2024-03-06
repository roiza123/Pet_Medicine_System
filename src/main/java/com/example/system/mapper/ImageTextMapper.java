package com.example.system.mapper;

import com.example.system.pojo.ImageText;
import com.example.system.pojo.Pet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface ImageTextMapper {

    //添加图文信息
    void addImageText(@Param("hId") Integer hId,@Param("itTitle")String itTitle, @Param("itText") String itText, @Param("itPhotosLink") String itPhotosLink);

    //删除图文信息
    void deleteImageText(@Param("id") Integer id);

    //更新图文信息
    void updateImageText(@Param("id") Integer id, @Param("hId") Integer hId, @Param("itTitle")String itTitle,@Param("itText") String itText, @Param("itPhotosLink") String itPhotosLink);

    //查找图文信息
    List<ImageText> searchImageText1(@Param("hId") Integer hId);

}