package Operar;

import java.util.ArrayList;
import java.util.Arrays;

public class Operações {

    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {2, 4, 6, 7, 8, 9};

        Print(a,b);
        Intersecção(a, b);
        União(a, b);
        AmenosB(a, b);
        AeB(a,b);
    }
    public static ArrayList<Integer> Print(int[] a, int[] b) {
        ArrayList<Integer> C = new ArrayList<>();
        System.out.print("A :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println("");
        System.out.print("B :");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            System.out.print(" ");
        }
        System.out.println();
        return C;
    }


    public static ArrayList<Integer> Intersecção(int[] a, int[] b) {
        ArrayList<Integer> C = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == b[j]) {
                    C.add(a[i]);
                }
            }
        }
        System.out.println("Intersecção " + C);
        return C;
    }


    public static ArrayList<Integer> AmenosB(int[] a, int[] b) {
        ArrayList<Integer> C = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            C.add(a[i]);
        }
        for (int i = 0; i < C.size(); i++) {
            for (int j = 0; j < C.size(); j++) {
                if (C.get(i) == b[j]) {
                    C.remove(C.get(i));
                }
            }
        }
        System.out.println("A - B = " + C);
        return C;
    }


    public static ArrayList<Integer> União(int[] a, int[] b) {
        ArrayList<Integer> C = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            C.add(a[i]);
        }
        for (int i = 0; i < C.size(); i++) {
            for (int j = 0; j < C.size(); j++) {
                if (C.get(i) == b[j]) {
                    C.remove(C.get(i));
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            C.add(b[i]);
        }

        System.out.println("União= " + C);
        return C;
    }

    public static ArrayList<Integer> AeB(int[] a, int[] b) {
        ArrayList<Integer> C = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            C.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            C.add(b[i]);
        }


        System.out.println("AeB= " + C);
        return C;
    }

}