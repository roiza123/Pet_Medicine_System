package com.example.system.service.impl;

import com.example.system.mapper.PetKeeperMapper;
import com.example.system.mapper.PetMapper;
import com.example.system.pojo.Pet;
import com.example.system.pojo.PetKeeper;
import com.example.system.service.PetKeeperService;
import com.example.system.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PetKeeperServiceImpl implements PetKeeperService {

    @Autowired
    private PetKeeperMapper petKeeperMapper;

    @Override
    public PetKeeper ifRightPetKeeper(String pkUsername, String pkPassword) {
        return petKeeperMapper.ifRightPetKeeper(pkUsername,pkPassword);
    }

    @Transactional
    @Override
    public void addPetKeeper(String pkName, String pkUsername, String pkPassword, String pkPhone, String pkAddress) {
        if (petKeeperMapper.ifHave(pkUsername)==null){
            petKeeperMapper.addPetKeeper(pkName,pkUsername,pkPassword,pkPhone,pkAddress);
        }
    }

    @Override
    public void deletePetKeeper(Integer id) {
        petKeeperMapper.deletePetKeeper(id);
    }

    @Override
    public void updatePetKeeper(Integer id, String pkName, String pkUsername, String pkPassword, String pkPhone, String pkAddress) {
        petKeeperMapper.updatePetKeeper(id,pkName,pkUsername,pkPassword,pkPhone,pkAddress);
    }

    @Override
    public PetKeeper ifHave(String pkUsername) {
        return petKeeperMapper.ifHave(pkUsername);
    }
}