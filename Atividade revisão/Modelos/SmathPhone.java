package Modelos;

import Celular.Celular;

public interface SmathPhone {

     public default String marca( ){
          return "";
     }

     public default String color( ){
          return "";
     }

     default int ano( ){
          return 0;
     }

     default String modelo( ){
          return "";
     }

}
