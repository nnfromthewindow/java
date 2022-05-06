module FX_mp3player {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.media;
	
	opens application to javafx.graphics, javafx.fxml;
}
