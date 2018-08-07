package calc_app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Aplicação Calculadora JavaFX
 * 
 * @author Rafael.Valle
 *
 */
public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Carrega o Layout contido no arquivo *.fxml 
		Pane root = FXMLLoader.load(getClass().getResource("/Layout.fxml"));
		
		//Cria a cena exibida pela classe principal
		Scene scene = new Scene(root, 220, 220);
		
		//Carrega o Estilo css da aplicação 
		scene.getStylesheets().add("/style.css");
		
		//Configura a cena para ser exibida na tela principal
		primaryStage.setScene(scene);
		
		//Configura o texto da janela da aplicação na barra de título
		primaryStage.setTitle("Calculadora App");
		
		//Impede o redimensionamento da janela
		primaryStage.setResizable(false);
		
		//Exibe a tela principal (palco principal)
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
