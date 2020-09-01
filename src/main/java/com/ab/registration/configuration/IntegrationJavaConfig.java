package com.ab.registration.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;

/**
 * @author Arpit Bhardwaj
 */

@Configuration
public class IntegrationJavaConfig {

    @Bean
    public MessageChannel registrationRequest(){
        return new DirectChannel();
    }
}
