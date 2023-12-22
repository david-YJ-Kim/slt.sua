package com.tsh.slt.sua.domain.scrap.work;

import com.tsh.slt.sua.config.SuaPropertyObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
@Component
public class ScrapServiceWorker implements Runnable{


//    @Value("${scrap.resource.path}")
//    private String path;

    @Autowired
    private SuaPropertyObject config;

    public String getPath(){
        return config.getScrapScriptPath();
    }

    public static void main(String[] args) {

        System.out.println(new ScrapServiceWorker().getPath());






        String productId = "1005001639866562";

//        URL resourceUrl = ScrapServiceWorker.class.getResource("/scrap");
//        String resourcePath = resourceUrl.getPath();
//        System.out.println(resourcePath);


//        try {
//            ProcessBuilder pb = new ProcessBuilder("node", "C:/Workspace/sellter/sellter.agent.ali.scarpper/scrapService.js", productId);
//            pb.redirectErrorStream(true);
//            Process process = pb.start();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//            int exitCode = process.waitFor();
//            System.out.println("\nExited with error code : " + exitCode);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }



    }

    public ScrapServiceWorker(){

    }

    @Override
    public void run() {

        String productId = "1005001639866562";

//        URL resourceUrl = ScrapServiceWorker.class.getResource("/scrap");
//        String resourcePath = resourceUrl.getPath();
//        System.out.println(resourcePath);


        try {
            ProcessBuilder pb = new ProcessBuilder("node", "src/main/resources/scrap/scrapService.js", productId);
            pb.redirectErrorStream(true);
            Process process = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            int exitCode = process.waitFor();
            System.out.println("\nExited with error code : " + exitCode);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
