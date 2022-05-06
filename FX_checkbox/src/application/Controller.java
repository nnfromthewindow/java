package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

	@FXML
	private CheckBox myCheckBox;
	@FXML
	private Label myLabel;
	@FXML
	private ImageView myImageView;
	
	Image myImage1 = new Image(getClass().getResourceAsStream("lightbulb1.png"));
	Image myImage2 = new Image(getClass().getResourceAsStream("lightbulb2.png"));
	
	public void change(ActionEvent event) {
		
		if(myCheckBox.isSelected()) {
			myLabel.setText("ON");
			myImageView.setImage(myImage1);
		}
		else {
			myLabel.setText("OFF");
			myImageView.setImage(myImage2);
		}
	}
}