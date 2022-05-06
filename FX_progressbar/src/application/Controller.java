package application;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;

public class Controller implements Initializable{

	@FXML
	private ProgressBar myProgressBar;
	
	@FXML
	private Button myButton;
	
	@FXML
	private Label myLabel;
	
	//The BigDecimal class gives its user complete control over rounding behavior
	//DecimalFormat df = new DecimalFormat("#.#");
	BigDecimal progress = new BigDecimal("0.0").setScale(1, RoundingMode.HALF_UP);
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		myProgressBar.setStyle("-fx-accent: #CB4335;");
		
	}
	
	public void increaseProgress() {
		
		if(progress.setScale(1, RoundingMode.HALF_UP).doubleValue() < 1) {
			progress = new BigDecimal(progress.setScale(1, RoundingMode.HALF_UP).doubleValue() + 0.1);
			myProgressBar.setProgress(progress.setScale(1, RoundingMode.HALF_UP).doubleValue());
			myLabel.setText(Integer.toString((int)(progress.setScale(1, RoundingMode.HALF_UP).doubleValue() * 100)) + "%");
			progress= progress.setScale(1, RoundingMode.HALF_UP).abs();
			System.out.println(progress);		
		}
	}
}
