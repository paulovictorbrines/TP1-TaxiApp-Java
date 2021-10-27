package menu;
import taxi.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class TelaChamadosMotorista extends JFrame {
    private JPanel pnlChamados;
    private JTextField txtIdDoChamado;
    private JButton btnConfirmar;
    private JComboBox txtTipo;
    private JTextField txtData;
    private JTextField txtOrigem;
    private JTextField txtPartida;
    private JTextField txtRetorno;
    private JTextField txtKmInicial;
    private JTextField txtKmFinal;
    private JTextField txtValorTotalChamado;
    private JLabel lblAbrir;
    private JPanel pnlChamadosMotorista;
    private JTable tableChamados;

    public TelaChamadosMotorista(String title, MotoristaApp motorista1, ArrayList<ChamadoApp> chamados){
        super(title);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(pnlChamadosMotorista);
        this.pack();

        carregarTabelaChamados(chamados);
        lblAbrir.setText("Motorista " + motorista1.getNome() + ", confirme a execução dos chamados");
        //btnConfirmar
        btnConfirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblAbrir.setText("Motorista " + motorista1.getNome() + ", a execução dos chamados foi confirmada!");
                chamados.clear();
                carregarTabelaChamados(chamados);
            }
        });

    }

    private void carregarTabelaChamados(ArrayList<ChamadoApp> chamados) {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Id do chamado", "Data", "Tipo", "Origem", "Destino", "Partida", "Retorno", "Quilometragem inicial", "Quilometragem final", "Valor total do chamado"},0);

        for (int i=0; i<chamados.size(); i++) {
            Object[] linha = new Object[]{chamados.get(i).getIdDoChamado(),chamados.get(i).getData(),chamados.get(i).getTipo(),chamados.get(i).getOrigem(),chamados.get(i).getDestino(),chamados.get(i).getPartida(),chamados.get(i).getRetorno(),chamados.get(i).getKmInicial(),chamados.get(i).getKmFinal(),chamados.get(i).getValorTotalChamado()};
            modelo.addRow(linha);
        }
        tableChamados.setModel(modelo);
    }
}


