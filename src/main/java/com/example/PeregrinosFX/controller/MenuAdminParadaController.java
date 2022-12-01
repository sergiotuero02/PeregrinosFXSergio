package com.example.PeregrinosFX.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;
@Controller
public class MenuAdminParadaController implements Initializable {

    @FXML
    private Button informeparadaBTN;

    @FXML
    private Button alojarseBTN;

    @FXML
    private Button cerrarsesionBTN;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
