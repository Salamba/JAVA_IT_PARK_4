package ru.itpark.app.services;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.app.models.Jewerly;
import ru.itpark.app.repositoris.JewerlyRepositoris;

import java.util.List;

@Service
public class JewerlyServicelmpl implements JewerlyService {

    @Autowired
    private JewerlyRepositoris jewerlyRepositoris;

    @Override
    public List<Jewerly> getAllJewerly() {
        List<Jewerly> jewerlyList = jewerlyRepositoris.findAllBy();
        return jewerlyList;
    }

    @Override
    public void addJewerly(Jewerly jewerly) {
        jewerlyRepositoris.save(jewerly);
    }

    @Override
    public Jewerly getJewerlyByBrand(String brand) {
        return jewerlyRepositoris.findJewerlyByBrand(brand);
    }
}
