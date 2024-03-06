package com.example.system.service.impl;

import com.example.system.mapper.ImageTextMapper;
import com.example.system.mapper.PetMapper;
import com.example.system.pojo.ImageText;
import com.example.system.pojo.Pet;
import com.example.system.service.ImageTextService;
import com.example.system.service.PetService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ImageTextServiceImpl implements ImageTextService {

    @Autowired
    private ImageTextMapper ImageTextMapper;

    @Transactional
    @Override
    public void addImageText(Integer hId, String itTitle, String itText, String itPhotosLink) {
        ImageTextMapper.addImageText(hId,itTitle,itText,itPhotosLink);
    }

    @Override
    public void deleteImageText(Integer id) {
        ImageTextMapper.deleteImageText(id);
    }

    @Override
    public void updateImageText(Integer id, Integer hId, String itTitle,String itText, String itPhotosLink) {
        ImageTextMapper.updateImageText(id,hId,itTitle,itText,itPhotosLink);
    }

    @Override
    public List<ImageText> searchImageText1(Integer hId) {
        return ImageTextMapper.searchImageText1(hId);
    }

}