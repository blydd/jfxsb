package com.bgt.billsb;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * javafx主类
 */
public class  JavaFxApplication extends Application {

    private Stage primaryStage;


    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        // 这里可以进行JavaFX界面的初始化操作
        primaryStage.setTitle("JavaFX with Spring Boot");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}