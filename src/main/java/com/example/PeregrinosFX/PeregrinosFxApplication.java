package com.example.PeregrinosFX;

import com.example.PeregrinosFX.controller.MenuPrincipalController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

import static javafx.application.Application.launch;

@SpringBootApplication
public class PeregrinosFxApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeregrinosFxApplication.class, args);
		launch();
	}

	public void start(Stage stage) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(MenuPrincipalController.class.getResource("MenuPrincipal.fxml"));
		Scene scene = new Scene(fxmlLoader.load(), 205, 205);
		// stage.setTitle("Ejemplo con Componente GUI");
		stage.setScene(scene);
		stage.show();
	}



}
