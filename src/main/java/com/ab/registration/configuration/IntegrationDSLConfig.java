package com.ab.registration.configuration;

import com.ab.registration.service.RegistrationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.MessageChannels;
import org.springframework.messaging.MessageChannel;

/**
 * @author Arpit Bhardwaj
 */

@Configuration
public class IntegrationDSLConfig {
    @Bean
    public MessageChannel registrationRequest(){
        return MessageChannels.direct("registrationRequest").get();
    }

    @Bean
    public IntegrationFlow integrationFlow(RegistrationService registrationService){
        return IntegrationFlows.from("registrationRequest")
                .handle(registrationService, "register")
                .get();
    }
}
