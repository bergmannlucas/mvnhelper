import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application{


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.getIcons().add(new Image("file:" + Util.ConfigPath.LOGO_MVNHELPER.getCaminho()));
        primaryStage.setFullScreen(false);
        primaryStage.setResizable(false);
        primaryStage.setTitle("MVN Helper V_0.3.0");

        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));

        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

}