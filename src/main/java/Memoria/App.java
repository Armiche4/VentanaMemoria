package Memoria;




import javafx.application.Application;

import javafx.scene.Scene;

import javafx.stage.Stage;

public class App extends Application {
	
	private Controlador vista;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		vista = new Controlador();
		
		Scene scene = new Scene(vista.getView());
		
		primaryStage.setTitle("Memoria");
		primaryStage.setScene(scene);
		
	//primaryStage.getIcons().add(new Image( "/EnviarCorreo/src/main/java/imagen/icono.png"));
		
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

	



	
}
