package com.example.PeregrinosFX.controller;

import com.example.PeregrinosFX.bean.Parada;
import com.example.PeregrinosFX.bean.Peregrino;
import com.example.PeregrinosFX.config.StageManager;
import com.example.PeregrinosFX.service.PeregrinoService;
import com.example.PeregrinosFX.view.FxmlView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static com.example.PeregrinosFX.controller.LoginController.rol;

@Controller
public class ExportarCarnetController implements Initializable{

    @Lazy
    @Autowired
    private StageManager stageManager;

    @Lazy
    @Autowired
    private PeregrinoService peregrinoService;

    @FXML
    private Button expcarnetBTN;

    @FXML
    private ComboBox peregrinosCB;

    @FXML
    private Button cancelarBTN;

    @FXML
    private void exportarCAction(ActionEvent event) throws IOException {
        //CODIGO MUESTRA XML EXPORTADO
    }

    @FXML
    private void cancelarAction(ActionEvent event) throws IOException {
        if(rol == 1) {
            stageManager.switchScene(FxmlView.MENUPEREGRINO);
        }
        if(rol == 3) {
            stageManager.switchScene(FxmlView.MENUADMINGENERAL);
        }
    }
    @FXML
    private void abrirRegistro(ActionEvent event) throws IOException {
        stageManager.switchScene(FxmlView.REGISTRO);
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ArrayList<Peregrino> peregrinos = new ArrayList<>();
        peregrinos = (ArrayList<Peregrino>) peregrinoService.findAll();
        for (Peregrino p1 : peregrinos) {
            peregrinosCB.getItems().add(p1);
        }
    }
}
