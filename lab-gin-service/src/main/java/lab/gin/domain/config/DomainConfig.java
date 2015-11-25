package lab.gin.domain.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import lab.gin.domain.LabGinDomainPackage;

@Configuration
@ComponentScan(basePackageClasses = { LabGinDomainPackage.class })
public class DomainConfig {
}