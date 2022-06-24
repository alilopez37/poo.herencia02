package com.upchiapas.herencia02.models;

import java.util.Arrays;

public class Electrodomestico {

    protected float precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected byte peso;

    private String[] colores = {"Blanco",
            "Negro",
            "Rojo",
            "Azul",
            "Gris"};

    //Constructor por defecto
    public Electrodomestico(){
        this(Catalogo.PRECIO_BASE,Catalogo.COLOR,Catalogo.CONSUMO_ENERGETICO,Catalogo.PESO);
    }
    //Constructor con dos atributos: precio y peso
    public Electrodomestico(float precio, byte peso){
        this(precio,Catalogo.COLOR,Catalogo.CONSUMO_ENERGETICO,peso);
    }

    // Constructor con todos los atributos
    public Electrodomestico(float precioBase, String color, char consumoEnergetico, byte peso) {
        if (!comprobarConsumoEnergetico(consumoEnergetico))
            consumoEnergetico = Catalogo.CONSUMO_ENERGETICO;
        if (!comprobarColor(color))
            color = Catalogo.COLOR;
        this.consumoEnergetico = consumoEnergetico;
        this.precioBase = precioBase;
        this.color = color;
        this.peso = peso;
    }

    private boolean comprobarConsumoEnergetico(char letra){
        boolean estado = false;
        if ("ABCDEF".indexOf(letra) != -1)
            estado = true;

        return estado;
    }

    private boolean comprobarColor(String color){
        boolean estado = false;
        int i= 0;
        do {
            if (colores[i].equals(color))
                estado = true;
            i++;
        } while (!estado && i< colores.length);

        return estado;
    }

    public float precioFinal(){
        switch (Character.toUpperCase(consumoEnergetico)){
            case 'A': precioBase += 100.0f; break;
            case 'B': precioBase += 80.0f; break;
            case 'C': precioBase += 60.0f; break;
            case 'D': precioBase += 50.0f; break;
            case 'E': precioBase += 30.0f; break;
            case 'F': precioBase += 10.0f; break;
        }

        if (peso>0 && peso<=19)
                precioBase += 10.0f;
        else if (peso>=20 && peso<=49)
            precioBase += 50.0f;
        else if (peso>=50 && peso<=79)
            precioBase += 80.0f;
        else if (peso>=80)
            precioBase += 100.0f;
        return precioBase;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                ", colores=" + Arrays.toString(colores) +
                '}';
    }
}

