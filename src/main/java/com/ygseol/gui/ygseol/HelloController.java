package com.ygseol.gui.ygseol;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onShowButtonClick() {
        try {

            URL url = new URL("http://localhost:8080/ygseol");
            if (welcomeText.getText().equals("Hello World!")) {
                welcomeText.setText("Hello!");
                HttpURLConnection request = getHttpURLConnection();
                BufferedInputStream out = new BufferedInputStream(request.getInputStream());

                System.out.println(out);


            } else {
                welcomeText.setText("Hello World!");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static HttpURLConnection getHttpURLConnection() throws IOException {
        HttpURLConnection request = (HttpURLConnection) new URL("https://svc.niceapi.co.kr:22001/digital/niceid/oauth/oauth/token HTTP/1.1").openConnection();
        request.setRequestProperty("Content-Type", "application/json");
        request.setRequestMethod("POST");
        request.setRequestProperty("Accept", "application/json");
        request.setRequestProperty("Accept", "*/*");
        request.setRequestProperty("Connection", "Keep-Alive");
        request.setRequestProperty("Charset", "UTF-8");
        return request;
    }

    @FXML
    protected void onHideButtonClick() {
        welcomeText.setText("인식");
        welcomeText.setLabelFor(welcomeText);

    }
}
