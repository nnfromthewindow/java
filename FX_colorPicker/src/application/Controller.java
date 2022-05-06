package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Controller {
	
	@FXML
	private Pane myPane;
	@FXML
	private ColorPicker myColorPicker;
	@FXML
	private Label myLabel;
	private Button myButton;
	
	
	public void changeColor(ActionEvent event) {
		
		Color myColor = myColorPicker.getValue();
		myPane.setBackground(new Background(new BackgroundFill(myColor, CornerRadii.EMPTY, Insets.EMPTY)));
		}
	
	public void changeText1(ActionEvent event) {
		
		myLabel.setText("Wally Cacarulo");
		
	}
public void changeText2(ActionEvent event) {
		
		myLabel.setText("Wally Salchicha");
		
	}
}