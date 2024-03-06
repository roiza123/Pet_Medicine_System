package com.example.system.controller;

import com.example.system.pojo.ImageText;
import com.example.system.service.ImageTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class ImageTextController {

    @Autowired
    private ImageTextService ImageTextService;

    //新增图文信息
    @RequestMapping(value = "addImageText",method = RequestMethod.POST)
    public int addImageText(@RequestBody ImageText ImageTextRequest) {
        //获取表单数据
       Integer hId = ImageTextRequest.getHId();
       String itTitle = ImageTextRequest.getItTitle();
       String itText = ImageTextRequest.getItText();
       String itPhotosLink = ImageTextRequest.getItPhotosLink();
       if(itText.length()<=256){
           ImageTextService.addImageText(hId,itTitle,itText,itPhotosLink);
           return 1;
       }else {
           return 0;
       }
    }

    //删除图文信息
    @RequestMapping(value = "deleteImageText",method = RequestMethod.GET)
    public void deleteImageText(Integer id){
        ImageTextService.deleteImageText(id);
    }

    //修改图文信息
    @RequestMapping(value = "updateImageText",method = RequestMethod.POST)
    public int updateImageText(@RequestBody ImageText ImageTextRequest){
        //获取表单数据
        Integer id = ImageTextRequest.getId();
        Integer hId = ImageTextRequest.getHId();
        String itTitle = ImageTextRequest.getItTitle();
        String itText = ImageTextRequest.getItText();
        String itPhotosLink = ImageTextRequest.getItPhotosLink();
        if(itText.length()<=256){
            ImageTextService.updateImageText(id,hId,itTitle,itText,itPhotosLink);
            return 1;
        }else {
            return 0 ;
        }
    }

    //查看图文信息（医疗机构端）
    @RequestMapping(value = "searchImageText1",method = RequestMethod.POST)
    public List<ImageText> searchImageText1(Integer hId){
        return ImageTextService.searchImageText1(hId);
    }


}