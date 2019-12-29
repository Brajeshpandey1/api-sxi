package com.anilallewar.microservices.registry;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.shared.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * The Main Spring Boot Application class that starts the Eureka discovery
 * server since the application is annotated with {@link EnableEurekaServer}.
 * <br>
 * <br>
 * 
 * Note that all these annotations work in conjunction with properties defined
 * in the external configuration files specified by the config server.
 * 
 * @author anilallewar
 */

@EnableEurekaServer
@SpringBootApplication
public class RegistryApplication {


	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(RegistryApplication.class, args);
	}
}






