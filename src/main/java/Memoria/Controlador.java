package Memoria;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.control.Slider;

import javafx.scene.layout.AnchorPane;


public class Controlador implements Initializable {

		
		
		@FXML
		private AnchorPane contenedor;
		
		
		@FXML
		private Slider rojo = new Slider();
		
		@FXML
		private Slider azul= new Slider();
		
		@FXML
		private Slider verde= new Slider();
		
	
		
		public AnchorPane getView() {
			return contenedor;
		}
		
		
		public Controlador() throws IOException {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista.fxml"));
		   loader.setController(this);
			
			loader.load();
			
			}


		public void initialize(URL location, ResourceBundle resources) {
			
			
			rojo.setMin(0);
			rojo.setMax(250);
			rojo.setValue(40);
			//rojo.setShowTickLabels(true);
			//rojo.setShowTickMarks(true);
			//rojo.setMajorTickUnit(50);
			//rojo.setMinorTickCount(5);
			//rojo.setBlockIncrement(10);
			
			   rojo.valueProperty().addListener(new ChangeListener<Number>() {
		            public void changed(ObservableValue<? extends Number> ov,
		                Number old_val, Number new_val) {
		            	
		            	//contenedor.setStyle("-fx-background-color: #ff0"+rojo.getValue());
		            	contenedor.setStyle("-fx-background-color: rgb("+rojo.getValue()+","+azul.getValue()+","+verde.getValue()+")");
		            }
			
			   });

			   
			   azul.setMin(0);
				azul.setMax(250);
				azul.setValue(40);
			  
				   azul.valueProperty().addListener(new ChangeListener<Number>() {
			            public void changed(ObservableValue<? extends Number> ov,
			                Number old_val, Number new_val) {
			            	
			            	
			            	contenedor.setStyle("-fx-background-color: rgb("+rojo.getValue()+","+azul.getValue()+","+verde.getValue()+")");
			            }
				
				   });

				   verde.setMin(0);
					verde.setMax(250);
					verde.setValue(40);
					
					   verde.valueProperty().addListener(new ChangeListener<Number>() {
				            public void changed(ObservableValue<? extends Number> ov,
				                Number old_val, Number new_val) {
				            	
				           
				            	contenedor.setStyle("-fx-background-color: rgb("+rojo.getValue()+","+azul.getValue()+","+verde.getValue()+")");
				            }
					
					   });

		}	
}
