package taxi;

public class ChamadoApp {
    private int idDoChamado;
    private String data;
    private String tipo;
    private String origem;
    private String destino;
    private float partida;
    private float retorno;
    private double kmInicial;
    private double kmFinal;
    private double valorTotalChamado;
    //
    private ClienteApp clienteApp;
    private MotoristaApp motoristaApp;
    private VeiculoApp veiculoApp;

    public ChamadoApp(int idDoChamado, String data, String tipo, String origem, String destino, float partida, float retorno, double kmInicial, double kmFinal, double valorTotalChamado){
        this.idDoChamado=idDoChamado;
        this.data=data;
        this.tipo=tipo;
        this.origem=origem;
        this.destino=destino;
        this.partida=partida;
        this.retorno=retorno;
        this.kmInicial=kmInicial;
        this.kmFinal=kmFinal;
        this.valorTotalChamado=valorTotalChamado;
        this.clienteApp = clienteApp;
        this.motoristaApp = motoristaApp;
        this.veiculoApp = veiculoApp;
    }

    public double getKmFinal() {
        return kmFinal;
    }
    public double getKmInicial() {
        return kmInicial;
    }
    public double getValorTotalChamado() {
        return valorTotalChamado;
    }
    public int getIdDoChamado() {
        return idDoChamado;
    }
    public String getData() {
        return data;
    }
    public String getDestino() {
        return destino;
    }
    public String getOrigem() {
        return origem;
    }
    public float getPartida() {
        return partida;
    }
    public float getRetorno() {
        return retorno;
    }
    public String getTipo() {
        return tipo;
    }
    //

    public void setCliente(ClienteApp clienteApp) {
        this.clienteApp = clienteApp;
    }
    public ClienteApp getCliente() {
        return clienteApp;
    }
    public void setMotorista(MotoristaApp motoristaApp) {
        this.motoristaApp = motoristaApp;
    }
    public MotoristaApp getMotorista() {
        return motoristaApp;
    }
    public void setVeiculo(VeiculoApp veiculoApp) {
        this.veiculoApp = veiculoApp;
    }
    public VeiculoApp getVeiculo() {
        return veiculoApp;
    }
}
