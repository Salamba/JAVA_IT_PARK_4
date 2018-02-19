package ru.itpark.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.itpark.app.forms.AddNewJewerly;
import ru.itpark.app.models.Jewerly;
import ru.itpark.app.models.JewerlyModel;
import ru.itpark.app.services.FilesStorageService;
import ru.itpark.app.services.JewerlyModelsService;
import ru.itpark.app.services.JewerlyService;

import javax.servlet.http.HttpServletResponse;

@Controller
public class FilesStorageController {

  @Autowired
  private FilesStorageService storageService;

  @Autowired
  private JewerlyService jewerlyService;

  @Autowired
  private JewerlyModelsService jewerlyModelsService;

  @PostMapping(value = "/add/jewerly")
  @ResponseStatus(value = HttpStatus.ACCEPTED)
  public String handleCarAdd(AddNewJewerly addNewJewerly) {

    Jewerly jewerly;
    jewerly = jewerlyService.getJewerlyByBrand(addNewJewerly.getBrand());
    if(jewerly==null) {
      jewerly = Jewerly.builder()
              .brand(addNewJewerly.getBrand())
              .build();
      jewerlyService.addJewerly(jewerly);
    }
    JewerlyModel jewerlyModel  = JewerlyModel.builder()
            .model(addNewJewerly.getModel())
            .jewerly(jewerly)
            .build();
    jewerlyModelsService.addJewerlyModel(jewerlyModel);
    return storageService.saveImage(addNewJewerly.getFile(), jewerlyModel);
  }

  @PostMapping(value = "/files")
  @ResponseBody
  public String handleFileUpload(@RequestParam("file") MultipartFile file) {
    return storageService.saveFile(file);
  }

  @GetMapping(value = "/files/{file-name:.+}")
  public void getFile(@PathVariable("file-name") String fileName,
                      HttpServletResponse response) {
    storageService.writeFileToResponse(fileName, response);
  }
}
