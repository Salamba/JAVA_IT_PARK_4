package ru.itpark.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.SocketUtils;
import ru.itpark.app.dto.JewerlyModelsDto;
import ru.itpark.app.models.JewerlyModel;
import ru.itpark.app.repositoris.JewerlyModelRepositoris;

import java.util.ArrayList;
import java.util.List;

@Service
public class JewerlyModelsServiceImpl implements JewerlyModelsService {

    List<JewerlyModelsDto> jewerlyModelsDtos = new ArrayList<>();

    @Autowired
    private JewerlyModelRepositoris jewerlyModelRepositoris;

    @Override
    public List<JewerlyModelsDto> getAllJewerlyModelById(Long id) {
        List<JewerlyModel> jewerlyModelList = jewerlyModelRepositoris.findByJewerly_Id(id);

        for (JewerlyModel jewerlyModel : jewerlyModelList) {
            jewerlyModelsDtos.add(new JewerlyModelsDto(jewerlyModel));
        }
        return jewerlyModelsDtos;
    }

    @Override
    public void addJewerlyModel(JewerlyModel jewerlyModel) {
        jewerlyModelRepositoris.save(jewerlyModel);
    }
}
