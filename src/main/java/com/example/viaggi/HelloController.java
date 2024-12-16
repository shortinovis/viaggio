package com.example.viaggi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    private agenziaViaggi box=new agenziaViaggi();
    @FXML
    private Label welcomeText;
    @FXML
    private TextField destinazione;
    @FXML
    private TextField costo;
    @FXML
    private TextField penscomp;
    @FXML
    private TextField andataeritorno;
    @FXML
    private TextField escursioni;
    @FXML
    private TextField durata;
    @FXML
    private Label labellina;

    @FXML
    protected void aggiunta() {
        if(!destinazione.getText().equals("") && !costo.getText().equals("") && !durata.getText().equals("") &&
                !penscomp.getText().equals("") && andataeritorno.getText().equals("") && escursioni.getText().equals("")){
            viaggioPasti v=new viaggioPasti(destinazione.getText(), Integer.parseInt(durata.getText()), Integer.parseInt(costo.getText()), Boolean.parseBoolean(penscomp.getText()));
            box.inserisci(v);
            labellina.setText("aggiunto viaggio");
        }else if(!destinazione.getText().equals("") && !costo.getText().equals("") && !durata.getText().equals("") &&
                penscomp.getText().equals("") && !andataeritorno.getText().equals("") && escursioni.getText().equals("")){
            viaggioVolo v=new viaggioVolo(destinazione.getText(), Integer.parseInt(durata.getText()), Integer.parseInt(costo.getText()), Boolean.parseBoolean(andataeritorno.getText()));
            box.inserisci(v);
            labellina.setText("aggiunto viaggio");
        }else if(!destinazione.getText().equals("") && !costo.getText().equals("") && !durata.getText().equals("") &&
                !penscomp.getText().equals("") && andataeritorno.getText().equals("") && !escursioni.getText().equals("")){
            viaggioEscursioni v=new viaggioEscursioni(destinazione.getText(), Integer.parseInt(durata.getText()), Integer.parseInt(costo.getText()), Boolean.parseBoolean(penscomp.getText()), Integer.parseInt(escursioni.getText()));
            box.inserisci(v);
            labellina.setText("aggiunto viaggio");
        }else{
            labellina.setText("parametri inserini erroneamente");
        }
    }

}