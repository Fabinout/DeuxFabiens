package io.vlc.carsgo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Deux Fabiens Cars Go.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

}
