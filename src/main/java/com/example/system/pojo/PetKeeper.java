package com.example.system.pojo;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PetKeeper {
    public Integer id;
    public String pkName;
    public String pkUsername;
    public String pkPassword;
    public String pkPhone;
    public String pkAddress;
}