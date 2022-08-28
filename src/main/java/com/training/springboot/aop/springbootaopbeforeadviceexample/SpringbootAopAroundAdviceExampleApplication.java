package com.training.springboot.aop.springbootaopbeforeadviceexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringbootAopAroundAdviceExampleApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootAopAroundAdviceExampleApplication.class, args);
// Fetching the employee object from the application context.
        com.training.springboot.aop.springbootaopbeforeadviceexample.service.BankService bank = context.getBean(com.training.springboot.aop.springbootaopbeforeadviceexample.service.BankService.class);
// Displaying balance in the account
        String accnumber = "12345";
        bank.displayBalance(accnumber);
// Closing the context object
        context.close();
    }

}
