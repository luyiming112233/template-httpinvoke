package org.example.invoke;

import okhttp3.Response;
import org.example.okhttp.HttpUtils;

import java.io.IOException;

public class Call {
    public static void run() throws IOException {
        Response response = HttpUtils.builder()
                .url("http://www.baidu.com")
                .get()
                .sync();

        if (!response.isSuccessful()) {
            throw new RuntimeException("请求失败");
        }

        System.out.println(response.body().string());
    }
}
