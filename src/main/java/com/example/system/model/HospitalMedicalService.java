package com.example.system.model;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HospitalMedicalService {
    public Integer id;
    public Integer hId;
    public String hName;
    public String msTitle;
    public String msIntroduce;
    public Integer msPrice;
    public String msIntroducePhotosLink;
}