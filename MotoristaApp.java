package taxi;

import java.util.ArrayList;

public class MotoristaApp {
    private int id;
    private String nome;
    private String telefone;
    private String cnh;
    //
    private ArrayList<ChamadoApp> chamados;

    public MotoristaApp(int id, String nome, String telefone, String cnh){
        this.id=id;
        this.nome=nome;
        this.telefone=telefone;
        this.cnh=cnh;
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getCnh() {
        return cnh;
    }
    //
    public void setChamados(ArrayList<ChamadoApp> chamados) {
        this.chamados = chamados;
    }
    public ArrayList<ChamadoApp> getChamados() {
        return chamados;
    }
}

