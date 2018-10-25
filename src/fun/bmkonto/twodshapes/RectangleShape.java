package fun.bmkonto.twodshapes;

import fun.bmkonto.constants.Constants;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RectangleShape extends Application {
    
    @Override
    public void start(Stage rectStage) throws Exception{
        Rectangle rect = new Rectangle(0,0,Constants.SMALL_WIDTH,Constants.SMALL_HEIGHT/2);
        
        Group group = new Group();
        group.getChildren().addAll(rect);
        
        Scene scene = new Scene(group, Constants.SMALL_WIDTH, Constants.SMALL_HEIGHT);
        rectStage.setScene(scene);
        rectStage.setTitle("Rectangle Shape");
        rectStage.show();
    }
    public static void main(String [] args){
        launch(args);
    }
}
