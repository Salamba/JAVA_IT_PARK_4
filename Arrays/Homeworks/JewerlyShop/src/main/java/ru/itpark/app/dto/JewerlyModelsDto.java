package ru.itpark.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import ru.itpark.app.models.JewerlyModel;
import ru.itpark.app.models.User;

@Data
@Builder
@AllArgsConstructor
public class JewerlyModelsDto {


    private String model;
    private String imageUrl;

    public JewerlyModelsDto(JewerlyModel model) {
        this.model = model.getModel();

        if (model.getImage() != null) {
            this.imageUrl = "/files/" + model.getImage().getStorageFileName();
        }
    }

}
