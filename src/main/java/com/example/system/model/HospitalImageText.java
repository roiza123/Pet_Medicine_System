package com.example.system.model;

import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HospitalImageText {
    public Integer id;
    public String hName;
    public Integer hId;
    public String itTitle;
    public String itText;
    public String itPhotosLink;
    public Date createTime;
}