package net.example.demo.bar;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "net.example.demo.bar.repo")
@ComponentScan({"net.example.demo.bar.inner", "net.example.demo.bar.repo"})
@EntityScan({"net.example.demo.bar.inner"})
public class BarConfig {
}
