
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.util.Random;

public class VideoPlayerApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();
        
        // Determina aleatoriamente qual final será exibido
        String finalVideo = new Random().nextBoolean() ? "video3_final.mp4" : "video4_final-alternativo.mp4";
        
        // Carrega a página HTML e passa o nome do vídeo final como parâmetro
        webEngine.load(getClass().getResource("video_player.html").toExternalForm() + "?finalVideo=" + finalVideo);
        
        Scene scene = new Scene(webView, 800, 450);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Reprodutor de Filme Interativo");
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}