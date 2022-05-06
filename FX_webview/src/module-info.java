module FX_webview {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.web;
	
	opens application to javafx.graphics, javafx.fxml;
}
