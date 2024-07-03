package org.example.mproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CarConfig {

    @Bean
    CommandLineRunner CommandLineRunner(CarRepository repository) {
        return args -> {
            CarEntity e30316=new CarEntity(1L,"e30","m40",1600,102);
            CarEntity e30325=new CarEntity(3L,"M3","s14",200,200);
            repository.saveAll(List.of(e30316,e30325));
        };

    }
}
