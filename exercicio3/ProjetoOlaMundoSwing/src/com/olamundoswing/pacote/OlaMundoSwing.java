package com.olamundoswing.pacote;

import javax.swing.JButton; // Declaração da classe JButton (botão gráfico)
import javax.swing.JFrame;  // Declaração da classe JFrame (janela gráfica)
import javax.swing.JLabel;  // Declaração da classe JLabel (rótulo ou label)
import javax.swing.SwingUtilities;  // Para garantir a execução na thread da GUI
import java.awt.FlowLayout;  // Layout para organizar os componentes
import java.awt.event.ActionEvent;  // Evento gerado quando o botão é clicado
import java.awt.event.ActionListener;  // Interface para ouvir o evento do botão

public class OlaMundoSwing {

    // Método principal (ponto de entrada do programa)
    public static void main(String[] args) {
        // SwingUtilities.invokeLater: Garante que a criação e atualização da GUI aconteça na thread certa
        SwingUtilities.invokeLater(() -> {
            // Declaração e criação de um objeto JFrame (janela da aplicação)
            JFrame frame = new JFrame("Título da Janela - Olá Mundo Swing");

            // Configurações básicas do JFrame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define o que acontece ao fechar a janela
            frame.setSize(300, 200); // Tamanho da janela
            frame.setLocationRelativeTo(null); // Centraliza a janela na tela

            // Declaração e definição do layout da janela
            frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

            // Criando um JLabel (rótulo) para exibir a mensagem após o clique
            JLabel label = new JLabel("Aqui vai aparecer a mensagem");

            // Declaração e criação de um JButton (botão)
            JButton botao = new JButton("Clique aqui");

            // Adicionando um ActionListener ao botão
            // ActionListener: Interface que escuta eventos de ação (como um clique)
            botao.addActionListener(new ActionListener() {
                // Método actionPerformed: Este método é chamado quando o botão é clicado
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Mudando o texto do JLabel para "Olá, Mundo!" após o clique
                    label.setText("Olá, Mundo!");
                }
            });

            // Adicionando o botão e o label ao JFrame
            frame.add(botao); // Adiciona o botão à janela
            frame.add(label); // Adiciona o label à janela

            // Tornando o JFrame visível para o usuário
            frame.setVisible(true);
        });
    }
}
