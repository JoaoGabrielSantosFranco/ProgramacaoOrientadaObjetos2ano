package pacote;

class Tempo {

    private int horas;
    private int minutos;
    private int segundos;
    private int milisegundos;


    public Tempo(int horas, int minutos, int segundos, int milisegundos) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
        setMilisegundos(milisegundos);
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getMilisegundos() {
        return milisegundos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void setMilisegundos(int milisegundos) {
        this.milisegundos = milisegundos;
    }

    public void imprimir() {
        System.out.println(this);
    }

    public Tempo subtrair(Tempo tempo) {

            return milisegundosTempo((this.emMilisegundos() - tempo.emMilisegundos())+3600000*24);

    }

    public Tempo somar(Tempo tempo) {
            return milisegundosTempo(this.emMilisegundos() + tempo.emMilisegundos());
    }

    public Tempo inicialreal(){
        return milisegundosTempo((this.emMilisegundos()));
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d:%02d", getHoras(), getMinutos(), getSegundos(),getMilisegundos());
    }

    private int emMilisegundos() {
        return (getHoras() * 3600000) + (getMinutos() * 60000) + getSegundos() * 1000 + getMilisegundos();
    }

    private static Tempo milisegundosTempo ( int totalMilisegundos) {

            int milisegundos = totalMilisegundos;
            int horas = milisegundos / 3600000;
            milisegundos -= (horas * 3600000);
            int minutos = milisegundos / 60000;
            milisegundos -= (minutos * 60000);
            int segundos = milisegundos / 1000;
            milisegundos -= (segundos * 1000);
            if (totalMilisegundos > 86400000) {
            horas -= 24;
            }
            return new Tempo(horas, minutos, segundos, milisegundos);
    }
}
