package olamundojavafx; // Declaração do pacote, onde o arquivo está localizado

import javafx.application.Application; // Importa a classe Application, que é a base para a aplicação JavaFX
import javafx.scene.Scene; // Importa a classe Scene, usada para criar a "tela" da aplicação
import javafx.scene.control.Button; // Importa a classe Button, que cria botões interativos
import javafx.scene.layout.StackPane; // Importa a classe StackPane, que é um tipo de layout
import javafx.stage.Stage; // Importa a classe Stage, que representa a janela da aplicação

public class OlaMundoJavaFx extends Application { // Declaração da classe 'OlaMundoJavaFx', que herda de 'Application'

    @Override // Anotação que indica que o método a seguir sobrescreve (substitui) um método da classe pai
    public void start(Stage primaryStage) { // Método start: ponto de entrada da aplicação JavaFX. Método = ação que a classe pode realizar.
        
        // Declaração e criação de um botão com o texto "Clique em mim!"
        Button btn = new Button("Clique em mim!");

        // Evento: define a ação que ocorrerá quando o botão for clicado
        // A ação do evento é imprimir "Olá Mundo!" no console
        btn.setOnAction(e -> System.out.println("Olá Mundo!"));

        // Declaração de um layout do tipo StackPane (os elementos são empilhados um sobre o outro)
        StackPane root = new StackPane();

        // Adiciona o botão ao layout 'root', que é um StackPane
        root.getChildren().add(btn);

        // Declaração e criação de uma cena (Scene) que irá conter o layout e os componentes
        Scene scene = new Scene(root, 300, 250); // 300x250 são as dimensões da cena

        // Configuração do palco (janela): define o título da janela
        primaryStage.setTitle("Olá Mundo JavaFX");

        // Define a cena (que contém o layout e o botão) para ser exibida na janela
        primaryStage.setScene(scene);

        // Exibe a janela para o usuário (abre a janela)
        primaryStage.show();
    }

    public static void main(String[] args) { // Método main: ponto de entrada da aplicação Java
        // Lança a aplicação JavaFX, chamando o método start() que cria a interface
        launch(args); // Método launch é fornecido pela classe Application e inicia a execução da aplicação JavaFX
    }
}
