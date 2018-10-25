package fun.bmkonto.colours;
 
import fun.bmkonto.constants.Constants;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class LinearGradientColor extends Application{
    @Override
    public void start(Stage gradientStage){
        Button btn1 = new Button("Button1");
        Button btn2 = new Button("Button2");
        Button btn3 = new Button("Button3");
        
        // create a red and yellow linear gradient
        Stop[] linearStop = new Stop[] {new Stop(0,Color.RED), new Stop(1,Color.YELLOW)};
        // new LinearGradient(startX, startY, endX, endY, Proportional, CycleMethod, stops)
        LinearGradient lgrad = new LinearGradient (0,0,1,0,true,CycleMethod.NO_CYCLE, linearStop);
        
        // create rectangle shape 
        Rectangle rect = new Rectangle(Constants.SMALL_WIDTH/2, Constants.SMALL_HEIGHT/2, 200,200);
        // set linear gradient to rect
        rect.setFill(lgrad);
        
        // vbox is a layout
        VBox vbox = new VBox();
        // add components to layout
        vbox.getChildren().addAll(btn1, btn2, btn3, rect);
        
        Scene scene = new Scene(vbox, Constants.SMALL_WIDTH, Constants.SMALL_HEIGHT, Color.YELLOW);
        gradientStage.setScene(scene);
        gradientStage.setTitle("LinearGradient");
        gradientStage.show();
    }
    
    public static void main(String [] args){
        launch(args);
    }
}
