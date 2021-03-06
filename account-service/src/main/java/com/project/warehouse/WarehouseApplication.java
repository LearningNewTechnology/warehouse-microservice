package com.project.warehouse;

import com.project.warehouse.event.config.EventMessageChannels;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.datastax.driver.core.Cluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.data.cassandra.mapping.SimpleUserTypeResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
@EnableTransactionManagement
@EnableBinding(EventMessageChannels.class)
@EnableConfigurationProperties(CassandraProperties.class)
public class WarehouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseApplication.class, args);
	}


	// cassandra config
	@Bean
	public SimpleUserTypeResolver simpleUserTypeResolver(Cluster cluster, CassandraProperties cassandraProperties){
		return new SimpleUserTypeResolver(cluster,cassandraProperties.getKeyspaceName());
	}
}
