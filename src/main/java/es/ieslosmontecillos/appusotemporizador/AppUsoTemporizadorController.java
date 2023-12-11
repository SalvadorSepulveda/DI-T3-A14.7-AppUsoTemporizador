package es.ieslosmontecillos.appusotemporizador;

import es.ieslosmontecillos.temporizadorjavafx.Temporizador;
import javafx.fxml.FXML;

public class AppUsoTemporizadorController {

    @FXML
    private Temporizador temporizador;

    @FXML
    public void initialize() {
        temporizador.iniciarCronometro();
    }
}