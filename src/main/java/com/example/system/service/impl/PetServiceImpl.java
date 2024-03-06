package com.example.system.service.impl;

import com.example.system.mapper.DoctorMapper;
import com.example.system.mapper.PetMapper;
import com.example.system.pojo.Doctor;
import com.example.system.pojo.Pet;
import com.example.system.service.DoctorService;
import com.example.system.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    private PetMapper petMapper;

    @Transactional
    @Override
    public void addPet(String pName, String pIntroduce, String pAddress, String pPhotosLink, Integer petKeeperId, String petKeeperPhone, String pType) {
        petMapper.addPet(pName,pIntroduce,pAddress,pPhotosLink,petKeeperId,petKeeperPhone,pType);
    }

    @Override
    public void deletePet(Integer id) {
        petMapper.deletePet(id);
    }

    @Override
    public void updatePet(Integer id, String pName, String pIntroduce, String pAddress, String pPhotosLink, Integer petKeeperId, String petKeeperPhone, String pType) {
        petMapper.updatePet(id,pName,pIntroduce,pAddress,pPhotosLink,petKeeperId,petKeeperPhone,pType);
    }

    @Override
    public List<Pet> searchPet1(Integer petKeeperId) {
        return petMapper.searchPet1(petKeeperId);
    }

    @Override
    public Pet searchPet2(Integer id) {
        return petMapper.searchPet2(id);
    }
}