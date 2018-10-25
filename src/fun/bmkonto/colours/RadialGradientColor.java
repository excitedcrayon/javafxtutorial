package fun.bmkonto.colours;

import fun.bmkonto.constants.Constants;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class RadialGradientColor extends Application{
    @Override
    public void start(Stage radStage){
        // create stops for the gradient color
        Stop[] gradientStop = new Stop[]{new Stop(0.0f, Color.BLUE), new Stop(1.0f, Color.RED)};
        // new RadialGradient(double focusAngle, double focusDistance, double centerX, double centerY, double radius, boolean proportional, CycleMethod cycleMethod, Stop... stops)
        RadialGradient radial = new RadialGradient(0, 
                0.5, 
                100, 
                100, Constants.SMALL_WIDTH, false, CycleMethod.NO_CYCLE, gradientStop);
        
        // create circle
        Circle circle = new Circle(Constants.SMALL_WIDTH/2,Constants.SMALL_HEIGHT/2,200);
        circle.setFill(radial);
        
        Group root = new Group();
        root.getChildren().addAll(circle);
        
        Scene scene = new Scene(root,Constants.SMALL_WIDTH, Constants.SMALL_HEIGHT, Color.WHITE);
        
        radStage.setScene(scene);
        radStage.setTitle("Radial Gradient");
        radStage.show();
    }
    
    public static void main(String [] args){
        launch(args);
    }
}
