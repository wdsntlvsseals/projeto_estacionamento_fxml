package ifpr.pgua.eic.exemplo.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import ifpr.pgua.eic.exemplo.App;
import ifpr.pgua.eic.exemplo.models.Estacionamento;
import ifpr.pgua.eic.exemplo.models.Veiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class TelaVisualizar implements Initializable {

    @FXML
    private ListView<Veiculo> lstVeiculos;

    @FXML
    private TextArea taDetalhes;

    private Estacionamento estacionamento;

    public TelaVisualizar(Estacionamento estacionamento){
        this.estacionamento = estacionamento;
    }

    @FXML
    void voltar(ActionEvent event) {
        App.popScreen();
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        lstVeiculos.getItems().clear();
        lstVeiculos.getItems().addAll(estacionamento.listaTodosVeiculos());
    }

}
