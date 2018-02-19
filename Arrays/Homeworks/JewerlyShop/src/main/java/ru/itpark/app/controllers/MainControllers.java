package ru.itpark.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.app.dto.JewerlyModelsDto;
import ru.itpark.app.models.Jewerly;
import ru.itpark.app.services.JewerlyModelsService;
import ru.itpark.app.services.JewerlyService;

import java.util.List;

@Controller
public class MainControllers {

    List<Jewerly> jewerlyList;

    List<JewerlyModelsDto> jewerlyModelsDtos;

    @Autowired
    private JewerlyService jewerlyService;

    @Autowired
    private JewerlyModelsService jewerlyModelsService;

    @GetMapping("/index")
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("/contact")
    public String getContactPage() {
        return "contact";
    }

    @GetMapping("/jewerly")
    public String getCarsPage(@ModelAttribute("model") ModelMap model) {
        jewerlyList = jewerlyService.getAllJewerly();
        model.addAttribute("carList", jewerlyList);
        return "jewerly";
    }

    @GetMapping("/addnewjewerly")
    public String getAddNewCarPage() {
        return "addnewjewerly";
    }

    //@RequestMapping(value = "/cars/model", method = RequestMethod.GET)
    @GetMapping("/jewerlymodel")
    public String getCarModelsPage(@RequestParam("id") Long id, @ModelAttribute("model") ModelMap model) {

        if (jewerlyModelsDtos!=null)
        {
            jewerlyModelsDtos.clear();
        }
        jewerlyModelsDtos = jewerlyModelsService.getAllJewerlyModelById(id);
        model.addAttribute("jewerlyModelsDtoList", jewerlyModelsDtos);

        return "jewerlymodels";
    }

}
