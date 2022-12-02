package com.example.PeregrinosFX.controller;

import com.example.PeregrinosFX.config.StageManager;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

@Controller
public class DatosParadaController implements Initializable {

    @Lazy
    @Autowired
    private StageManager stageManager;

    @FXML
    private Label paradaLBL;

    @FXML
    private Label fechainicialLBL;

    @FXML
    private Label fechafinalLBL;

    @FXML
    private Label estanciasLBL;

    @FXML
    private DatePicker fechainicialDATE;

    @FXML
    private DatePicker fechafinalDATE;

    //Muestra menú peregrino o menú admin general
    @FXML
    private Button inicioBTN;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
