package com.somaswing.pacote;

import javax.swing.JFrame;  // Importa a classe para criar a janela principal
import javax.swing.JButton; // Importa a classe para criar botões
import javax.swing.JLabel;  // Importa a classe para criar textos explicativos (labels)
import javax.swing.JTextField; // Importa a classe para criar campos de texto
import javax.swing.JOptionPane; // Importa a classe para exibir caixas de mensagem (como alertas)
import java.awt.event.ActionEvent; // Importa a classe para tratar eventos de ação, como clicar no botão
import java.awt.event.ActionListener; // Importa a interface para ouvir ações no botão (evento)

public class SomaSwing {
    public static void main(String[] args) {
        // Criação da janela principal
        JFrame frame = new JFrame("Soma de Dois Números");  // Cria uma janela com o título "Soma de Dois Números"
        frame.setSize(300, 200);  // Define o tamanho da janela: 300 pixels de largura por 200 pixels de altura
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Configura para fechar a aplicação quando a janela for fechada
        frame.setLayout(null);  // Não utiliza layout padrão, vai definir as posições manualmente

        // Criação do primeiro label (texto explicativo) e campo de texto
        JLabel label1 = new JLabel("Número 1:");  // Label explicando que o próximo campo é para o primeiro número
        label1.setBounds(30, 30, 80, 25);  // Define a posição (30px da esquerda, 30px do topo) e o tamanho (80x25px)
        JTextField campo1 = new JTextField();  // Campo de texto para digitar o primeiro número
        campo1.setBounds(110, 30, 100, 25);  // Define a posição e o tamanho do campo de texto

        // Criação do segundo label e campo de texto
        JLabel label2 = new JLabel("Número 2:");  // Label explicando que o próximo campo é para o segundo número
        label2.setBounds(30, 70, 80, 25);  // Define a posição e o tamanho
        JTextField campo2 = new JTextField();  // Campo de texto para digitar o segundo número
        campo2.setBounds(110, 70, 100, 25);  // Define a posição e o tamanho

        // Criação do botão para realizar a soma
        JButton botaoSoma = new JButton("Somar");  // Cria o botão com o texto "Somar"
        botaoSoma.setBounds(80, 110, 120, 25);  // Define a posição e o tamanho do botão

        // Criação do label que vai mostrar o resultado da soma
        JLabel resultadoLabel = new JLabel("Resultado: ");  // Label para exibir o resultado da soma
        resultadoLabel.setBounds(30, 150, 250, 25);  // Define a posição e o tamanho do label de resultado

        // Ação que será executada quando o botão "Somar" for clicado
        botaoSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Pega os valores digitados nos campos de texto
                    double num1 = Double.parseDouble(campo1.getText());  // Converte o texto do primeiro campo em número
                    double num2 = Double.parseDouble(campo2.getText());  // Converte o texto do segundo campo em número
                    double soma = num1 + num2;  // Realiza a soma dos dois números

                    // Exibe o resultado no label de resultado
                    resultadoLabel.setText("Resultado: " + soma);  // Atualiza o texto do resultado

                } catch (NumberFormatException ex) {
                    // Caso o usuário digite algo que não seja número (causando erro na conversão)
                    JOptionPane.showMessageDialog(frame, "Por favor, insira números válidos.");  // Exibe uma mensagem de erro
                }
            }
        });

        // Adiciona todos os componentes na janela (frame)
        frame.add(label1);  // Adiciona o label "Número 1"
        frame.add(campo1);  // Adiciona o campo de texto para o primeiro número
        frame.add(label2);  // Adiciona o label "Número 2"
        frame.add(campo2);  // Adiciona o campo de texto para o segundo número
        frame.add(botaoSoma);  // Adiciona o botão "Somar"
        frame.add(resultadoLabel);  // Adiciona o label que vai mostrar o resultado

        // Torna a janela visível para o usuário
        frame.setVisible(true);  // Exibe a janela na tela
    }
}
