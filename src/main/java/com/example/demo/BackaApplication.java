package com.example.demo;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author yww51
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BackaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackaApplication.class, args);
    }

}
