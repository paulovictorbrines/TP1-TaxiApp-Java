package menu;
import taxi.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaChamadosCliente extends JFrame {
    private JPanel pnlChamados;
    private JTextField txtIdDoChamado;
    private JButton btnConfirmar;
    private JComboBox txtTipo;
    private JTextField txtData;
    private JTextField txtOrigem;
    private JTextField txtDestino;
    private JTextField txtPartida;
    private JTextField txtRetorno;
    private JTextField txtKmInicial;
    private JTextField txtKmFinal;
    private JTextField txtValorTotalChamado;
    private JLabel lblTexto1;
    private JLabel lblTexto2;
    private JButton btnSair;

    public TelaChamadosCliente(String title, ClienteApp cliente1, ArrayList<ChamadoApp> chamados, int i){
        super(title);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(pnlChamados);
        this.pack();

        lblTexto1.setText("Cliente " + cliente1.getNome() + ", abra um chamado: ");

        //btnConfirmar
        final int[] finalI = {i};
        btnConfirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int idDoChamado = Integer.parseInt(txtIdDoChamado.getText());
                String data = txtData.getText();
                String tipo;
                if (txtTipo.getSelectedIndex() == 1) {
                    tipo = "corrida";
                } else if (txtTipo.getSelectedIndex() == 2) {
                    tipo = "viagem";
                } else {
                    tipo = "viagem";
                }
                String origem = txtOrigem.getText();
                String destino = txtDestino.getText();
                float partida = Float.parseFloat((txtPartida.getText()));
                float retorno = Float.parseFloat((txtRetorno.getText()));
                double kmInicial = Double.parseDouble(txtKmInicial.getText());
                double kmFinal = Double.parseDouble(txtKmFinal.getText());
                double valorTotalChamado = Double.parseDouble(txtValorTotalChamado.getText());

                finalI[0]++;
                chamados.add(new ChamadoApp(idDoChamado, data, tipo, origem, destino, partida, retorno, kmInicial, kmFinal, valorTotalChamado));
                lblTexto1.setText("Cliente " + cliente1.getNome() + ", você abriu " + finalI[0] + " chamado(s)");
                lblTexto2.setText("Cliente " + cliente1.getNome() + ", limpe os dados anteriores e abra um novo chamado caso queira: ");
            }
        });

        btnSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }
}


