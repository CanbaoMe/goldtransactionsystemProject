package com.czb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author:chairongcan
 * @time:2019年7月23日00:43:38
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GoldtransactionsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoldtransactionsystemApplication.class, args);
    }

}
