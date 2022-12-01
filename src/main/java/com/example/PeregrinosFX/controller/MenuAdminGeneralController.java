package com.example.PeregrinosFX.controller;

import com.example.PeregrinosFX.config.StageManager;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

@Controller
public class MenuAdminGeneralController implements Initializable {

    @Lazy
    @Autowired
    private StageManager stageManager;

    @FXML
    private Button informeparadaBTN;

    @FXML
    private Button exportarcarnetBTN;

    @FXML
    private Button alojarseBTN;

    @FXML
    private Button cerrarsesionBTN;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
