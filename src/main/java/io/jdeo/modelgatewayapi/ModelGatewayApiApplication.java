package io.jdeo.modelgatewayapi;

//import com.netflix.discovery.DiscoveryClient;
//import com.netflix.discovery.shared.transport.jersey.EurekaJerseyClientImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.context.annotation.Bean;
//
//import java.security.NoSuchAlgorithmException;

@EnableDiscoveryClient
@SpringBootApplication
public class ModelGatewayApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModelGatewayApiApplication.class, args);
    }

//    @Bean
//    public DiscoveryClient.DiscoveryClientOptionalArgs discoveryClientOptionalArgs() throws NoSuchAlgorithmException {
//        DiscoveryClient.DiscoveryClientOptionalArgs args = new DiscoveryClient.DiscoveryClientOptionalArgs();
//        System.setProperty("javax.net.ssl.keyStore", "src/main/resources/ssltest.p12");
//        System.setProperty("javax.net.ssl.keyStorePassword", "Tba,77to");
//        System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");
//        EurekaJerseyClientImpl.EurekaJerseyClientBuilder builder = new EurekaJerseyClientImpl.EurekaJerseyClientBuilder();
//        builder.withClientName("account-client");
//        builder.withSystemSSLConfiguration();
//        builder.withMaxTotalConnections(10);
//        builder.withMaxConnectionsPerHost(10);
//        args.setEurekaJerseyClient(builder.build());
//        return args;
//    }

}
