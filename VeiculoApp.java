package taxi;

public class VeiculoApp {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    //
    private ChamadoApp[] chamadoApps;

    public VeiculoApp(String placa, String marca, String modelo, String cor, int ano){
        this.placa=placa;
        this.marca=marca;
        this.modelo=modelo;
        this.cor=cor;
        this.ano=ano;
    }

    public int getAno() {
        return ano;
    }
    public String getCor() {
        return cor;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getPlaca() {
        return placa;
    }
    //
    public void setChamados(ChamadoApp[] chamadoApps) {
        this.chamadoApps = chamadoApps;
    }
    public ChamadoApp[] getChamados() {
        return chamadoApps;
    }
}
