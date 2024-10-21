package br.mackenzie.webservice;

import java.util.*;

public class CarrosManager {
    private List<Carro> carros;
    public CarrosManager(){
        this.carros = new ArrayList<>();
        this.carros.add(new Carro("Nivus", "VW"));
        this.carros.add(new Carro("Tucson", "Hynday"));
    }
    public List<Carro> getCarros(){
        return carros;
    }
}
