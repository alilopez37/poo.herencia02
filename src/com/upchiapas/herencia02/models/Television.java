package com.upchiapas.herencia02.models;

public class Television extends Electrodomestico{
    private byte resolucion;
    private boolean sintonizadorTDT;


    public Television() {
        this(Catalogo.PRECIO_BASE, Catalogo.COLOR, Catalogo.CONSUMO_ENERGETICO, Catalogo.PESO, Catalogo.RESOLUCION_BASE,Catalogo.TDT);
    }

    public Television(float precio, byte peso){
        this(precio, Catalogo.COLOR, Catalogo.CONSUMO_ENERGETICO, peso, Catalogo.RESOLUCION_BASE, Catalogo.TDT);
    }
    public Television(float precioBase, String color, char consumoEnergetico, byte peso, byte resolucion, boolean sintonizadorTDT){
        super(precioBase, color, consumoEnergetico,peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public byte getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public float precioFinal(){
        super.precioBase += super.precioFinal();
        if (this.resolucion > 40)
            super.precioBase *= 1.3f;
        if (sintonizadorTDT)
            super.precioBase += 50.0f;
        return super.precioBase;
    }
}
