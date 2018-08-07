package calc_app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane root = FXMLLoader.load(getClass().getResource("/Layout.fxml"));
		Scene scene = new Scene(root, 220, 220);
		scene.getStylesheets().add("/style.css");
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculadora App");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
