/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Bruno
 */
public class Main extends Application {

    private AnchorPane rootLayout;
    private Stage stage;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        stage.setTitle("Cadastro de Bugs");
        initRootLayout();
        stage.show();
    }

    private void initRootLayout() {
        try {

            // carregando o layout do arquivo fxml
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("TelaInicial.fxml"));
            rootLayout = (AnchorPane) loader.load();

            Scene scene = new Scene(rootLayout);

            stage.setScene(scene);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Deu pau.");
        }
    }
    
    public static void main (String[] args){
        launch(args);
    }

}
