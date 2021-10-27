package menu;
import taxi.ChamadoApp;
import taxi.VeiculoApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicial extends JFrame {
    private JPanel pnlInicial;
    private JTextField txtPlaca;
    private JButton btnConfirmar;
    private JTextField txtMarca;
    private JTextField txtModelo;
    private JTextField txtCor;
    private JTextField txtAno;

    public TelaInicial(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlInicial);
        this.pack();

        btnConfirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String placa = txtPlaca.getText();
                String marca = txtMarca.getText();
                String modelo = txtModelo.getText();
                String cor = txtCor.getText();
                int ano = Integer.parseInt(txtAno.getText());
                VeiculoApp veiculo1 = new VeiculoApp(placa, marca, modelo, cor, ano);

                JFrame frameTaxi = new TelaTaxi("Taxi App", veiculo1);
                frameTaxi.setSize(480,640);
                frameTaxi.setVisible(true);
                frameTaxi.setLocationRelativeTo(null);
                setVisible(false);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frameTela = new TelaInicial("Tela Inicial");
        frameTela.setSize(480,640);
        frameTela.setLocationRelativeTo(null); //fica no meio
        frameTela.setVisible(true);

    }
}