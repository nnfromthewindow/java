package application;
 
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application {

 
 public static void main(String[] args) {
  launch(args);
 }

 @Override
 public void start(Stage stage) throws Exception {
  
  //Stage stage = new Stage();
  Group root = new Group();
  Scene scene = new Scene(root,Color.BLACK);
  
  //Image icon = new Image("icon.png");
  //stage.getIcons().add(icon);
  stage.setTitle("Stage Demo Program w00t w00t");
  //stage.setWidth(420);
  //stage.setHeight(420);
  //stage.setResizable(false);
  //stage.setX(50);
  //stage.setY(50);
  stage.setFullScreen(true);
  stage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q");
  stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
  
  stage.setScene(scene);
  stage.show();
 }
}