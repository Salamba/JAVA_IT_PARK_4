package ru.itpark.app.services;

import ru.itpark.app.models.Jewerly;

import java.util.List;

public interface JewerlyService {
   List<Jewerly> getAllJewerly();
   void addJewerly(Jewerly jewerly);
   Jewerly getJewerlyByBrand(String brand);
}
