package com.example.btbt_btcar.service;

import com.example.btbt_btcar.model.Cake;
import com.example.btbt_btcar.repository.CakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CakeService {
    @Autowired
    public CakeRepository cakeRepository;

    public List<Cake> getCakeList () {
        return cakeRepository.getCakeList ( );
    }

    public void createCake ( Cake cake ) {
        cakeRepository.createCake ( cake );
    }
}
