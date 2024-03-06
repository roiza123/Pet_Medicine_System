package com.example.system.pojo;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Doctor {
    public Integer id;
    public String dName;
    public String dUsername;
    public String dPassword;
    public String dHospital;
    public String dPhone;
    public String dIntroduce;
    public String dIntroducePhotosLink;
}