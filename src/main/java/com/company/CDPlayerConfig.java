package com.company;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    @Bean
    public CompactDisk sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public MediaPlayer cDPlayer() {
        return new CDPlayer(sgtPeppers());
    }

}
