package menu;

import taxi.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaCliente extends JFrame {
    private JTextField txtId;
    private JTextField txtCpf;
    private JTextField txtNome;
    private JTextField txtTelefone;
    private JButton btnConfirmar;
    private JTextField txtRg;
    private JPanel pnlCliente;
    private JTextField txtN;
    private JLabel lblAbrir;

    public TelaCliente(String title, ArrayList<ChamadoApp> chamados) {
        super(title);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(pnlCliente);
        this.pack();

        //btnConfirmar
        btnConfirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int id = Integer.parseInt(txtId.getText());
                String rg = txtRg.getText();
                String cpf = txtCpf.getText();
                String nome = txtNome.getText();
                String telefone = txtTelefone.getText();
                ClienteApp cliente1 = new ClienteApp(id, rg, cpf, nome, telefone);

                setVisible(false);
                int i=0;
                JFrame frameChamadosCliente = new TelaChamadosCliente("Abrir Chamado(s)", cliente1, chamados, i);
                frameChamadosCliente.setSize(480,680);
                frameChamadosCliente.setLocationRelativeTo(null);
                frameChamadosCliente.setVisible(true);


            }
        });
    }
}
