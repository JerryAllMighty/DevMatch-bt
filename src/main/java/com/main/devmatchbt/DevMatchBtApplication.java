package com.main.devmatchbt;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing //배치 기능 활성
@SpringBootApplication
public class DevMatchBtApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevMatchBtApplication.class, args);
    }

}
