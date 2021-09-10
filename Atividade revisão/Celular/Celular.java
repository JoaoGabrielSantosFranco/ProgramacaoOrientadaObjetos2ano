package Celular;

import Modelos.SmathPhone;

public class Celular implements SmathPhone {
    public String ligando (){
        return "Ligando Com ";
    }
    public String toString(){
        return ligando() + "Marca: " + marca() +  "     Modelo: " + modelo() + " Ano :"+ ano() + " cor" + color();
    }
}
