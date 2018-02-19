package ru.itpark.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.SocketUtils;
import ru.itpark.app.dto.JewerlyModelsDto;
import ru.itpark.app.models.JewerlyModel;
import ru.itpark.app.repositoris.CarsModelRepositoris;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarModelsServiceImpl implements CarModelsService {

    List<JewerlyModelsDto> jewerlyModelsDtos = new ArrayList<>();

    @Autowired
    private CarsModelRepositoris carsModelRepositoris;

    @Override
    public List<JewerlyModelsDto> getAllCarsModelById(Long id) {
        List<JewerlyModel> jewerlyModelList = carsModelRepositoris.findByJewerly_Id(id);

        for (JewerlyModel jewerlyModel : jewerlyModelList) {
            jewerlyModelsDtos.add(new JewerlyModelsDto(jewerlyModel));
        }
        return jewerlyModelsDtos;
    }

    @Override
    public void addCarModel(JewerlyModel jewerlyModel) {
        carsModelRepositoris.save(jewerlyModel);
    }
}
