package br.mackenzie.webservice;

import java.util.*;

public class CarrosManager {
    private List<Carro> carros;
    public CarrosManager(){
        this.carros = new ArrayList<>();
    }
    public List<Carro> getCarros(){
        return carros;
    }
}
