package auction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@EnableJpaRepositories
//@EntityScan(basePackages = {"auction.model"})
////@ComponentScan(basePackages={ "auction.controller", "auction.service.impl", "auction.repository", "auction.service", "auction.converter"})
//@SpringBootApplication

@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan(basePackages={"auction"})
@EnableJpaRepositories(basePackages="auction.repository")
@EnableTransactionManagement
@EntityScan(basePackages="auction.model")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

