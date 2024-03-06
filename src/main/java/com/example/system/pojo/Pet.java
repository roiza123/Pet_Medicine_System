package com.example.system.pojo;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pet {
    public Integer id;
    public String pName;
    public String pAddress;
    public String pIntroduce;
    public String pPhotosLink;
    public Integer petKeeperId;
    public String petKeeperPhone;
    public  String pType;
}