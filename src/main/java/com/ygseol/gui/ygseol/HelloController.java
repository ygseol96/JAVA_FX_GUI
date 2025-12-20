package com.ygseol.gui.ygseol;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onShowButtonClick() {
        try {
            // http://openapi.foodsafetykorea.go.kr/api/8e44d4748d1f4dcc9205/10760/json/시작/끝인덱스/
            HttpClient client = HttpClient.newHttpClient(); //HTTP 프로토콜 요청하는 인스턴스 생성
            URI url = new URI("http://openapi.foodsafetykorea.go.kr/api/8e44d4748d1f4dcc9205/I0760/json/1/5"); //API 규격에 맞게 파라미터 전송.
            HttpRequest request = HttpRequest.newBuilder().GET().uri(url).build(); //빌더형식으로 속성값 지정.
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); //응답객체를 별도로 만들어. 클라이언트 객체와함께 요청객체를 적재하여 요청 및 응답
            System.out.println(response);
            welcomeText.setText(response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    protected void onHideButtonClick() {
        welcomeText.setText("인식");
        welcomeText.setLabelFor(welcomeText);

    }
}
