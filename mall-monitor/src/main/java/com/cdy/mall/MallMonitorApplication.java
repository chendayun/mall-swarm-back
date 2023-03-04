package com.cdy.mall;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author CDY
 */
@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
public class MallMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallMonitorApplication.class);
    }
}
