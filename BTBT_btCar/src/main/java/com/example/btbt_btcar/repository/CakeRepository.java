package com.example.btbt_btcar.repository;

import com.example.btbt_btcar.model.Cake;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CakeRepository {
    List<Cake> list = new ArrayList<> ( );



    public List<Cake> getCakeList () {
        return list;
    }

    public void createCake ( Cake cake ) {
        list.add ( cake );
    }
}
