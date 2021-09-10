package Modelos;

import Celular.Celular;

public class BananaPhone extends Celular implements SmathPhone {

        @Override
        public String marca() {
            return "Nokia";
        }

        @Override
        public String color() {
            return "Amarelo";
        }

        @Override
        public int ano() {
            return 2018;
        }

        @Override
        public String modelo() {
            return " banana phone 8110 ";
        }

    @Override
    public String ligando() {
        return "Está ligado seu Smartphone";
    }
}
