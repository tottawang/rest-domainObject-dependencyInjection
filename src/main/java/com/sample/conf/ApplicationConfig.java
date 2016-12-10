package com.sample.conf;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.EnableLoadTimeWeaving.AspectJWeaving;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@Configuration
@EnableSpringConfigured
@EnableLoadTimeWeaving(aspectjWeaving = AspectJWeaving.ENABLED)
public class ApplicationConfig extends ResourceConfig {

  public ApplicationConfig() {
    packages("com.sample.resources");
  }
}
