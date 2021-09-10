package app.entidade;

public class Pessoa {
    private int ID;
    private String Nome;
    private String Sobrenome;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }
    public String toString(){
        return "Nome: " + getNome() +  "     Sobrenome: " + getSobrenome() + " ID :"+ getID();
    }
}

