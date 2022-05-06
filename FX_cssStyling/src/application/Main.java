package application;
 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
 
 @Override
 public void start(Stage stage) {
  try {
   Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
   Scene scene = new Scene(root);
   //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
   String css = this.getClass().getResource("application.css").toExternalForm();
   scene.getStylesheets().add(css);
   stage.setScene(scene);
   stage.show();
  } catch(Exception e) {
   e.printStackTrace();
  }
 } 

 public static void main(String[] args) {
  launch(args);
 }
}