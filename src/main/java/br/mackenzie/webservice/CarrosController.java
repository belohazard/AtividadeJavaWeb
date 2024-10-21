package br.mackenzie.webservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/carros")
public class CarrosController {

    private final CarrosManager carrosManager = new CarrosManager();


    @GetMapping
    public List<Carro> all() {
        return carrosManager.getCarros();
    }
}
