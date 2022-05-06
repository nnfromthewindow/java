module FX_mediaview {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.media;
	
	opens application to javafx.graphics, javafx.fxml;
}
