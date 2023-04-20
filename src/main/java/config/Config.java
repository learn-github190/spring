package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan({ "proxies", "repositories", "services" })
@ComponentScan({ "services", "proxies", "repositories" })
public class Config {
}
