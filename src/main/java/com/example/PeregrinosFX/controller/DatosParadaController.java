package com.example.PeregrinosFX.controller;

import com.example.PeregrinosFX.bean.Estancia;
import com.example.PeregrinosFX.bean.Parada;
import com.example.PeregrinosFX.config.StageManager;
import com.example.PeregrinosFX.service.EstanciaService;
import com.example.PeregrinosFX.service.ParadaService;
import com.example.PeregrinosFX.service.impl.EstanciaServiceImpl;
import com.example.PeregrinosFX.view.FxmlView;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Scanner;

import static com.example.PeregrinosFX.controller.LoginController.rol;
import static com.example.PeregrinosFX.controller.LoginController.u;

@Controller
public class DatosParadaController implements Initializable {

    @Lazy
    @Autowired
    private StageManager stageManager;

    @Lazy
    @Autowired
    private EstanciaService estanciaService;

    @Lazy
    @Autowired
    private ParadaService paradaService;

    @FXML
    private TableView estanciasTABLE;

    @FXML
    private TableColumn idColmn;

    @FXML
    private TableColumn fechaColmn;

    @FXML
    private TableColumn vipColmn;

    @FXML
    private TableColumn peregrinoColmn;

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

    @FXML
    private ComboBox paradaCB;

    @FXML
    private void datosParada(ActionEvent event) throws IOException {
        try {
            Object o = paradaCB.getSelectionModel().getSelectedItem();
            Parada paradaBD = paradaService.findByIdParada(1L);
            LocalDate fechaInicial, fechaFinal;
            fechaInicial = fechainicialDATE.getValue();
            fechaFinal = fechafinalDATE.getValue();
            Parada paradaux = null;

            idColmn.setCellValueFactory(new PropertyValueFactory<>("idEstancia"));
            fechaColmn.setCellValueFactory(new PropertyValueFactory<>("fecha"));
            vipColmn.setCellValueFactory(new PropertyValueFactory<>("vip"));
            peregrinoColmn.setCellValueFactory(new PropertyValueFactory<>("peregrino"));

            paradaCB.setEditable(false);
            if (fechaInicial.isEqual(fechaFinal)) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Fechas incorrectas");
                alert.setHeaderText(null);
                alert.setContentText("Las fechas son iguales.");
                alert.showAndWait();
            }

            if (fechaInicial.isAfter(fechaFinal)) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Fechas incorrectas");
                alert.setHeaderText(null);
                alert.setContentText("La fecha final es antes que la inicial.");
                alert.showAndWait();

            }

            if (fechaInicial.isBefore(fechaFinal)) {
                ArrayList<Estancia> estanciasBD = (ArrayList<Estancia>) estanciaService.findByParada(paradaBD);
                for (Estancia e : estanciasBD) {
                    if (e.getFecha().equals(fechaFinal) || e.getFecha().equals(fechaFinal) || e.getFecha().isAfter(fechaInicial) && e.getFecha().isBefore(fechaFinal)) {
                        estanciasTABLE.getItems().add(e);
                    }

                }

            }

            if (fechaInicial.isEqual(fechaFinal)) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Fechas incorrectas");
                alert.setHeaderText(null);
                alert.setContentText("Las fechas son iguales.");
                alert.showAndWait();
            }

            if (fechaInicial.isAfter(fechaFinal)) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Fechas incorrectas");
                alert.setHeaderText(null);
                alert.setContentText("La fecha final es antes que la inicial.");
                alert.showAndWait();

            }

            if (fechaInicial.isBefore(fechaFinal)) {
                ArrayList<Estancia> estanciasBD = (ArrayList<Estancia>) estanciaService.findAll();
                for (Estancia e : estanciasBD) {
                    if (e.getFecha().equals(fechaFinal) || e.getFecha().equals(fechaFinal) || e.getFecha().isAfter(fechaInicial) && e.getFecha().isBefore(fechaFinal) && e.getParada() == u.getParada()) {
                        estanciasTABLE.getItems().add(e);
                    }

                }

            }

        } catch (NullPointerException e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Fechas no introducidas");
            alert.setHeaderText(null);
            alert.setContentText("Introduzca las fechas");
            alert.showAndWait();
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Parada no introducida");
            alert.setHeaderText(null);
            alert.setContentText("Introduzca la parada");
            alert.showAndWait();
        }

    }

    @FXML
    private void volverAlMenu(ActionEvent event) throws IOException {
        if (rol == 2) {
            stageManager.switchScene(FxmlView.MENUADMINPARADA);
        }
        if (rol == 3) {
            stageManager.switchScene(FxmlView.MENUADMINGENERAL);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (rol == 2) {
            paradaCB.setValue(u.getParada().toString());
        } else {
            ArrayList<Parada> paradas = new ArrayList<>();
            paradas = (ArrayList<Parada>) paradaService.findAll();
            for (Parada p : paradas) {
                paradaCB.getItems().add(p);
            }
        }
    }
}
