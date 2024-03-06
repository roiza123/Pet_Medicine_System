package com.example.system.pojo;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Hospital {
    public Integer id;
    public String hName;
    public String hUsername;
    public String hPassword;
    public String hWorkTime;
    public String hPhone;
    public String hAddress;
    public String hIntroduce;
    public String hIntroducePhotosLink;
    public Integer hEvaluation;


}