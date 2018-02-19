package ru.itpark.app.repositoris;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.itpark.app.models.JewerlyModel;

import java.util.List;

public interface JewerlyModelRepositoris extends JpaRepository<JewerlyModel, Long> {
    List<JewerlyModel> findByJewerly_Id(Long id);
}
