package ru.itpark.app.repositoris;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.app.models.Jewerly;

import java.util.List;

public interface JewerlyRepositoris extends JpaRepository<Jewerly, Long> {
    List<Jewerly> findAllBy();

    Jewerly findJewerlyByBrand(String model);
}
