import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Codigos {
    protected static void Ganhos(int valor) {
        try {
            List<String> linhas1 = new ArrayList<>();
            linhas1.add(String.valueOf(valor));
            Files.write(Paths.get("Diretorio/Ganhos.Dat"), linhas1, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected static void Despesas(int valor) {
        try {
            List<String> linhas2 = new ArrayList<>();
            linhas2.add(String.valueOf(valor));
            Files.write(Paths.get("Diretorio/Despesas.Dat"), linhas2, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    protected static void Ler() {
        try {
            List<String> linhas = Files.readAllLines(Paths.get("Diretorio/Ganhos.Dat"));
            List<String> linhas2 = Files.readAllLines(Paths.get("Diretorio/Despesas.Dat"));
            for (String s : linhas) {
                System.out.println("Ganhos : " + s);
            }
            for (String s : linhas2) {
                System.out.println("Despesas : " + s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    protected static void Saldo() {
        Ler();
        try {
            int a = 0;
            int b = 0;
            List<String> list1 = Files.readAllLines(Paths.get("Diretorio/Ganhos.Dat"));
            for (int i = 0; i < list1.size(); i++) {
                a = a + Integer.parseInt(list1.get(i));
            }
            System.out.println("Soma dos Ganhos " + a);
            List<String> list2 = Files.readAllLines(Paths.get("Diretorio/Despesas.Dat"));
            for (int i = 0; i < list2.size(); i++) {
                b = b + Integer.parseInt(list2.get(i));
            }
            System.out.println("Soma das dispesas " + b);
            System.err.println("Saldo atual : " + (a-b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
