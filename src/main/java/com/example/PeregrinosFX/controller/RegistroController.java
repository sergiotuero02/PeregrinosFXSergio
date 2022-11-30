package com.example.PeregrinosFX.controller;

import javafx.fxml.*;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class RegistroController implements Initializable {

    @FXML
    private Label nombreLBL;

    @FXML
    private Label usuarioLBL;

    @FXML
    private Label contrasenaLBL;

    @FXML
    private Label confirmcontraLBL;

    @FXML
    private Label paradaLBL;

    @FXML
    private Label nacionalidadLBL;

    @FXML
    private TextField nombreTF;

    @FXML
    private TextField usuarioTF;

    @FXML
    private TextField contrasenaTF;

    @FXML
    private TextField confirmcontraTF;

    @FXML
    private ComboBox paradaCB;

    @FXML
    private ComboBox nacionalidadCB;

    @FXML
    private Button aceptarBTN;

    @FXML
    private Button cancelarBTN;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
