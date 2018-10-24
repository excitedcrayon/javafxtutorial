package fun.bmkonto.start;

import fun.bmkonto.constants.Constants;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    
    private final static String TITLE = "Hello JavaFX World";
    
    @Override
    public void start(Stage mainStage) throws Exception{
        // create button
        Button btn = new Button("Close Window");

        btn.setOnAction((ActionEvent event) -> {
            // close window
            System.exit(0);
        });
        
        // create StackPane
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        // create Scene
        Scene scene = new Scene(root, Constants.SMALL_WIDTH, Constants.SMALL_HEIGHT);
        
        // add sceene to stage
        mainStage.setScene(scene);
        mainStage.setTitle(TITLE);
        // show stage gui
        mainStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
