package com.ygseol.gui.ygseol;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.BufferedInputStream;
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

    private Task getDrugInfo() {
        String drugUrl = ""

                Task < String > httpTask = new Task<String>() {
                    @Override
                    protected String call() throws Exception {
                        return "";
                    }
                };
    }


    @FXML
    protected void onHideButtonClick() {
        welcomeText.setText("인식");
        welcomeText.setLabelFor(welcomeText);

    }
}
