package ru.itpark.app.forms;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class AddNewJewerly {
    private String brand;
    private String model;
    MultipartFile file;
}
