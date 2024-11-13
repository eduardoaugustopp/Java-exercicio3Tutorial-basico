package com.votacaoswing.pacote;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VotacaoSwing extends JFrame {
    private JTextField txtAno;
    private JLabel lblResultado;

    public VotacaoSwing() {
        setTitle("Verificação de Votação");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblAno = new JLabel("Ano de Nascimento:");
        lblAno.setBounds(10, 20, 150, 25);
        add(lblAno);

        txtAno = new JTextField();
        txtAno.setBounds(150, 20, 100, 25);
        add(txtAno);

        JButton btnVerificar = new JButton("Verificar");
        btnVerificar.setBounds(100, 60, 100, 30);
        add(btnVerificar);

        lblResultado = new JLabel("");
        lblResultado.setBounds(10, 100, 250, 25);
        add(lblResultado);

        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarVotacao();
            }
        });
    }

    private void verificarVotacao() {
        int anoAtual = 2023; // Atualize para o ano corrente se necessário
        try {
            int anoNascimento = Integer.parseInt(txtAno.getText());
            int idade = anoAtual - anoNascimento;

            if (idade < 16) {
                lblResultado.setText("Não vota");
            } else if ((idade >= 16 && idade < 18) || idade > 70) {
                lblResultado.setText("Voto opcional");
            } else {
                lblResultado.setText("Voto obrigatório");
            }
        } catch (NumberFormatException ex) {
            lblResultado.setText("Insira um ano válido.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VotacaoSwing frame = new VotacaoSwing();
            frame.setVisible(true);
        });
    }
}
