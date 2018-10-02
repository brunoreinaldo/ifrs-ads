package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {

	private BorderPane root;
	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {

		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Exemplo");

		iniciaRootLayout();

		mostraTelaPrincipal();

	}

	/**
	 * Abre o root
	 */
	public void iniciaRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("../view/Root.fxml"));
			root = (BorderPane) loader.load();

			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Mostra tela principal
	 */
	public void mostraTelaPrincipal() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("../view/Principal.fxml"));
			AnchorPane principal = (AnchorPane) loader.load();

			root.setCenter(principal);




		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
