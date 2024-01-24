package com.example.btbt_btcar.service;

import com.example.btbt_btcar.repository.CarRepository;
import com.example.btbt_btcar.model.Car;
import com.example.btbt_btcar.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<Car> getCarList() {
        return carRepository.getCarList();
    }

    public void createCar(Car car) {
        carRepository.createCar(car);
    }

    public Car getCarById(int id) {
        return carRepository.getCarById(id);
    }

    public void updateCar(Car car){
        carRepository.updateCar(car);
    }
}