package fun.bmkonto.twodshapes;
 
import fun.bmkonto.constants.Constants;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class LineShape extends Application {
    private static String lineTitle = "Line Shape";
    
    @Override
    public void start(Stage lineStage) throws Exception{
        // create new line object
        Line line = new Line();
        line.setStartX(0);
        line.setStartY(Constants.SMALL_HEIGHT / 2);
        line.setEndX(Constants.SMALL_WIDTH);
        line.setEndY(Constants.SMALL_HEIGHT / 2);
        
        // creating multiple shapes
        // args are startX, startY, endX, endY;
        Line newLine1 = new Line(0, 0, Constants.SMALL_WIDTH, Constants.SMALL_HEIGHT);
        Line newLine2 = new Line(0, 0, Constants.SMALL_WIDTH, Constants.SMALL_HEIGHT / 3);
        
        // add shape to Group
        Group group = new Group();
        group.getChildren().add(line);
        group.getChildren().addAll(newLine1, newLine2);
        
        // add group to scene
        Scene lineScene = new Scene(group, Constants.SMALL_WIDTH, Constants.SMALL_HEIGHT);
        
        lineStage.setScene(lineScene);
        lineStage.setTitle(lineTitle);
        lineStage.show();
    }
    
    public static void main(String [] args){
        launch(args);
    }
    
}
