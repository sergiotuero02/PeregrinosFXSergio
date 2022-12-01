package com.example.PeregrinosFX.controller;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

@Controller
public class MenuPrincipalController implements Initializable {
    @FXML
    private Button iniciarsesionBTN;

    @FXML
    private Button registrarseBTN;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
