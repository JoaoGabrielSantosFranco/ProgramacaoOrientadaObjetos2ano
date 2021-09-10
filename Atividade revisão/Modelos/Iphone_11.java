package Modelos;

import Celular.Celular;

public class Iphone_11 extends Celular implements SmathPhone {


    @Override
    public String marca() {
        return "Apple";
    }

    @Override
    public String color() {
        return "Vermelho";
    }

    @Override
    public int ano() {
        return 2019;
    }

    @Override
    public String modelo() {
        return "Iphone 11 ";
    }

    @Override
    public String ligando() {
        return "Está ligado seu SmartPhone ";
    }

}
