package org.example.demo.foo;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "org.example.demo.foo.repo")
@ComponentScan("org.example.demo.foo.inner")
@EntityScan({"org.example.demo.foo.inner"})
public class FooConfig {
}
