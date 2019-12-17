package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;


public class ControllerLogin {
    @FXML
    private JFXButton ButtonRegistrate;

    @FXML
    void pulsarRegistrate(ActionEvent event) {
    	Stage stage = (Stage) ButtonRegistrate.getScene().getWindow();
    	stage.close();
    	String vista = "Registration.fxml";
		String titulo = "Registration";
		ControllerRegistration control = new ControllerRegistration();
		crearVentana(vista, titulo, control);

    }
    public void crearVentana(String vista, String titulo, Object object) { 
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(this.getClass().getResource(vista));
			loader.setController(object);
			GridPane pagina = (GridPane) loader.load();
			
			Stage sendStage = new Stage();
			sendStage.setTitle(titulo);
			Scene scene = new Scene(pagina);
			sendStage.setScene(scene);
			sendStage.show();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }

}
