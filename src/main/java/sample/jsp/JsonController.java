package sample.jsp;


import org.springframework.web.bind.annotation.*;
import sample.dao.AdressRepository;
import sample.dao.DataAdress;

import java.util.List;

@RestController
@RequestMapping

public class JsonController {

    final AdressRepository adressRepository;

    public JsonController(AdressRepository adressRepository) {
        this.adressRepository = adressRepository;
    }

    @GetMapping("/alladress")
    @ResponseBody
    public Iterable<DataAdress> setAdress_Person() {
        Iterable<DataAdress> test = adressRepository.findAll();
        return test;
    }

}