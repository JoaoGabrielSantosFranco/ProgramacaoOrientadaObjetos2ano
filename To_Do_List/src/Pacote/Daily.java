package Pacote;

public class Daily {

    private String data;
    private String afazer;
    private int feito;

    public  Daily(){}

    public Daily(String data, String afazer, int feito) {
        this.data = data;
        this.afazer = afazer;
        this.feito = feito;
    }

    @Override

    public String toString() {
        return " " + afazer + "   "+ data+ " ";
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAfazer() {
        return afazer;
    }

    public void setAfazer(String afazer) {this.afazer = afazer;}

    public int getFeito() {
        return feito;
    }

    public void setFeito(int feito) {
        this.feito = feito;
    }
}
