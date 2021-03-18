package com.example.maven.app;

import com.github.kevinsawicki.http.HttpRequest;
import java.util.UUID;

/**
 * @author Ray
 * @date created in 2021/3/15 11:28
 */
public class PushMessage {
    public static void main(String[] args) {
        System.out.println("开始运行。。。。");
        String serverKey = System.getenv("SERVER_KEY");

        String pushUrl = String.format("https://sctapi.ftqq.com/%s.send", serverKey);
        String response = HttpRequest.post(pushUrl)
                .form("text", "github action test")
                .form("desp", UUID.randomUUID().toString())
                .body();
        System.out.println("response message：" + response);
    }
}
