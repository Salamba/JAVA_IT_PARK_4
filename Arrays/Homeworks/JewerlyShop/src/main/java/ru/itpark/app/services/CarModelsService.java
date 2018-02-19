package ru.itpark.app.services;

import org.springframework.stereotype.Service;
import ru.itpark.app.dto.JewerlyModelsDto;
import ru.itpark.app.models.JewerlyModel;

import java.util.List;

@Service
public interface CarModelsService {

    List<JewerlyModelsDto> getAllCarsModelById(Long id);
    void addCarModel(JewerlyModel jewerlyModel);
}
