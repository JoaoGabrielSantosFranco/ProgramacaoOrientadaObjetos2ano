package OperarTest;

import Operar.Operações;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class OperaçõesTest {


    @Test
    public void Intersecção() {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {2, 4, 6, 7, 8, 9};
        ArrayList<Integer> C = Operações.Intersecção(a , b);
        assertEquals("Exer 001 : Listas devem ser iguais. "
                , Arrays.asList(2, 4, 6)
                , C);
    }


    @Test
    public void AmenosB() {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {2, 4, 6, 7, 8, 9};
        ArrayList<Integer> C = Operações.AmenosB(a , b);
        assertEquals("Exer 001 : Listas devem ser iguais. "
                , Arrays.asList(1,3,5)
                , C);
}

    @Test
    public void União() {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {2, 4, 6, 7, 8, 9};
        ArrayList<Integer> C = Operações.União(a , b);
        assertEquals("Exer 001 : Listas devem ser iguais. "
                , Arrays.asList(1, 3, 5, 2, 4, 6, 7, 8, 9)
                , C);
    }
    @Test
    public void AeB() {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {2, 4, 6, 7, 8, 9};
        ArrayList<Integer> C = Operações.AeB(a , b);
        assertEquals("Exer 001 : Listas devem ser iguais. "
                , Arrays.asList(1, 2, 3, 4, 5, 6, 2, 4, 6, 7, 8, 9)
                , C);
    }


}


