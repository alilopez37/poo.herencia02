package com.upchiapas.herencia02;

import com.upchiapas.herencia02.models.Electrodomestico;
import com.upchiapas.herencia02.models.Lavadora;
import com.upchiapas.herencia02.models.Television;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Electrodomestico> lista = new ArrayList<>();
        lista.add(new Lavadora());
        lista.add(new Lavadora(5500.00f,(byte)30));
        lista.add(new Lavadora(5500.00f,"Azul",'A',(byte)30,(byte)10));
        //Creamos 03 objetos Television
        lista.add(new Television());
        lista.add(new Television(5500.00f,(byte)30));
        lista.add(new Television(6500.00f,(byte)30));
        lista.add(new Television(5500.00f,"Azul",'A',(byte)30,(byte)21,false));

        //Creamos 03 objetos de la clase Electrodoméstico
        lista.add(new Electrodomestico());
        lista.add(new Electrodomestico(5500.00f,(byte)30));
        lista.add(new Electrodomestico(5500.00f,"Azul",'A',(byte)30));

        float totalTelevision = 0.0f;
        float totalLavadora = 0.0f;
        float totalElectrodomestico = 0.0f;

        for (int i=0;i<lista.size();i++) {
            if (lista.get(i) instanceof Lavadora)
                totalLavadora += lista.get(i).precioFinal();
            else if (lista.get(i) instanceof Television)
                totalTelevision += lista.get(i).precioFinal();
            else if (lista.get(i) instanceof Electrodomestico)
                totalElectrodomestico += lista.get(i).precioFinal();
        }

        System.out.println("Total acumulado Electrodomestico: " + totalElectrodomestico);
        System.out.println("Total acumulado Lavadora: " + totalLavadora);
        System.out.println("Total acumulado Televisión: " + totalTelevision);
    }
}
