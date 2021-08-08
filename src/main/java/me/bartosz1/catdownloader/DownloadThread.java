package me.bartosz1.catdownloader;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.net.URI;

import java.util.concurrent.TimeUnit;

public class DownloadThread implements Runnable{

    String picName;
    public DownloadThread(String catPicName){
        picName = catPicName;
    }
    @Override
    public void run() {
        OkHttpClient http = new OkHttpClient.Builder().callTimeout(15, TimeUnit.SECONDS).connectTimeout(15, TimeUnit.SECONDS).readTimeout(15, TimeUnit.SECONDS).build();
        Request req = new Request.Builder().url("https://api.mythicalkitten.com/cats").build();
        Response resp = null;
        JSONObject json = null;
        try {
            resp = http.newCall(req).execute();
            json = new JSONObject(resp.body().string());
        } catch (IOException e) {
            System.out.println("Some error occurred when downloading cat picture. Check your internet connection / API availability.");
            e.printStackTrace();
            return;
        }
        try {
            FileUtils.copyURLToFile(URI.create(json.getString("url")).toURL(), new File(picName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Cat picture downloaded to file "+picName);
    }
}
