package ru.itpark.app.services;

import ru.itpark.app.models.Jewerly;

import java.util.List;

public interface CarsService {
   List<Jewerly> getAllCars();
   void addCar(Jewerly jewerly);
   Jewerly getCarByBrand(String brand);
}
