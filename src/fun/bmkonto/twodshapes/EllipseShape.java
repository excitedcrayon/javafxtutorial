package fun.bmkonto.twodshapes;
 
import fun.bmkonto.constants.Constants;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class EllipseShape extends Application{
    @Override
    public void start(Stage elipStage) throws Exception{
        // x , y, radiusX, radiusY
        Ellipse elip = new Ellipse(Constants.SMALL_WIDTH/2,Constants.SMALL_HEIGHT/2, Constants.SMALL_WIDTH/10, Constants.SMALL_HEIGHT/10);
        Group egroup = new Group();
        egroup.getChildren().addAll(elip);
        
        Scene escene = new Scene(egroup, Constants.SMALL_WIDTH, Constants.SMALL_HEIGHT, Color.RED);
        elipStage.setScene(escene);
        elipStage.setTitle("Ellipse Shape");
        elipStage.show();
    }
    public static void main(String [] args){
        launch(args);
    }
}
