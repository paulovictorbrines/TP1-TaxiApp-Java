package menu;
import taxi.ChamadoApp;
import taxi.ClienteApp;
import taxi.MotoristaApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaMotorista extends JFrame {
    private JTextField txtCnh;
    private JTextField txtTelefone;
    private JTextField txtNome;
    private JTextField txtId;
    private JButton btnConfirmar;
    private JPanel pnlMotorista;

    public TelaMotorista(String title, ArrayList<ChamadoApp> chamados) {
        super(title);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(pnlMotorista);
        this.pack();

        //btnConfirmar
        btnConfirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(txtId.getText());
                String nome = txtNome.getText();
                String telefone = txtTelefone.getText();
                String cnh = txtCnh.getText();
                MotoristaApp motorista1 = new MotoristaApp(id, nome, telefone, cnh);

                setVisible(false);
                JFrame frameChamadosMotorista = new TelaChamadosMotorista("Executar Chamados", motorista1, chamados);
                frameChamadosMotorista.setSize(1280, 480);
                frameChamadosMotorista.setLocationRelativeTo(null);
                frameChamadosMotorista.setVisible(true);

            }
        });
    }
}
