package com.example.system.pojo;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MedicalService {
    public Integer id;
    public Integer hId;
    public String msTitle;
    public String msIntroduce;
    public Integer msPrice;
    public String msIntroducePhotosLink;
}