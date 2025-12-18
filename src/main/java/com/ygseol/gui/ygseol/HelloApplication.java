package com.ygseol.gui.ygseol;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 450, 340);
        scene.getStylesheets().add("/style/main.css"); //스타일시트 입히기
        stage.setTitle("영양제 복용량 관리 어플리케이션");
        stage.setScene(scene);
        stage.show();


    }
}
