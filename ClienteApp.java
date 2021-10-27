package taxi;

import java.util.ArrayList;

public class ClienteApp {
    private int id;
    private String rg;
    private String cpf;
    private String nome;
    private String telefone;
    //
    private ArrayList<ChamadoApp> chamados;

    public ClienteApp(int id, String rg, String cpf, String nome, String telefone){
        this.id=id;
        this.rg=rg;
        this.cpf=cpf;
        this.nome=nome;
        this.telefone=telefone;
    }

    public int getId() {
        return id;
    }
    public String getRg() {
        return rg;
    }
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    //
    public void setChamados(ArrayList<ChamadoApp> chamados) {
        this.chamados = chamados;
    }
    public ArrayList<ChamadoApp> getChamados() {
        return chamados;
    }
}

