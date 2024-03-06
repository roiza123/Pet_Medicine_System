package com.example.system.pojo;

import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ImageText {
    public Integer Id;
    public Integer hId;
    public String itTitle;
    public String itText;
    public String itPhotosLink;
    public Date createTime;
}