package com.project.warehouse.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.dsl.channel.MessageChannels;

// Messaging config class
@Configuration
public class MessagingConfig {

    @Bean("authServerAccountServiceBridgeInboundChannel")
    public DirectChannel authServerAccountServiceBridgeInboundChannel(){
        return MessageChannels.direct().get();
    }

    @Bean("authServerAccountServiceBridgeOutboundChannel")
    public DirectChannel authServerAccountServiceBridgeOutboundChannel(){
        return MessageChannels.direct().get();
    }

    @Bean("authServerAccountServiceBridgeInboundQueue")
    public Queue authServerAccountServiceBridgeInboundQueue(){
        return new Queue("authServerAccountServiceBridgeInboundQueue", false);
    }

    @Bean("authServerAccountServiceBridgeOutboundQueue")
    public Queue authServerAccountServiceBridgeOutboundQueue(){
        return new Queue("authServerAccountServiceBridgeOutboundQueue", false);
    }
}