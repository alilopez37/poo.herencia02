package com.upchiapas.herencia02.models;

public class Lavadora extends Electrodomestico{
    private byte carga;


    public Lavadora() {
        this(Catalogo.PRECIO_BASE, Catalogo.COLOR, Catalogo.CONSUMO_ENERGETICO, Catalogo.PESO, Catalogo.CARGA_BASE);
    }

    public Lavadora(float precio, byte peso){
        this(precio, Catalogo.COLOR, Catalogo.CONSUMO_ENERGETICO, peso, Catalogo.CARGA_BASE);
    }
    public Lavadora(float precioBase, String color, char consumoEnergetico, byte peso, byte carga){
        super(precioBase, color, consumoEnergetico,peso);
        this.carga = carga;
    }

    public byte getCarga() {
        return carga;
    }

    @Override
    public float precioFinal(){
        super.precioBase = super.precioBase + super.precioFinal();
        if (this.carga > 30)
            super.precioBase += 50.0f;

        return super.precioBase;
    }
}
