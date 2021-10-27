package menu;
import taxi.ChamadoApp;
import taxi.VeiculoApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaTaxi extends JFrame  {
    private JPanel pnlTelaTaxi;
    private JButton btnCliente;
    private JButton btnMotorista;
    private JButton btnSair;
    private JTextField txtQntd;

    public TelaTaxi(String title, VeiculoApp veiculo1) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlTelaTaxi);
        this.pack();

        ArrayList<ChamadoApp> chamados = new ArrayList<>();

        //btnMotorista
        btnMotorista.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frameMotorista = new TelaMotorista("Motorista", chamados);
                frameMotorista.setSize(480,640);
                frameMotorista.setLocationRelativeTo(null);
                frameMotorista.setVisible(true);
                //setVisible(false);
            }
        });

        //btnCliente
        btnCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frameCliente = new TelaCliente("Cliente", chamados);
                frameCliente.setSize(480,640);
                frameCliente.setLocationRelativeTo(null);
                frameCliente.setVisible(true);
                //setVisible(false);
            }
        });

        //btnSair
        btnSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}


