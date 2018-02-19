package ru.itpark.app.services;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.app.models.Jewerly;
import ru.itpark.app.repositoris.CarsRepositoris;

import java.util.List;

@Service
public class CarsServicelmpl implements CarsService {

    @Autowired
    private CarsRepositoris carsRepositoris;

    @Override
    public List<Jewerly> getAllCars() {
        List<Jewerly> jewerlyList = carsRepositoris.findAllBy();
        return jewerlyList;
    }

    @Override
    public void addCar(Jewerly jewerly) {
        carsRepositoris.save(jewerly);
    }

    @Override
    public Jewerly getCarByBrand(String brand) {
        return carsRepositoris.findJewerlyByBrand(brand);
    }
}
