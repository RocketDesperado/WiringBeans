package com.company;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisk {

    private String title = "sgt pepper's lonely hearts club";
    private String artist = "the beatles";

    public void play() {
        System.out.println("Playing " +title +" by " +artist);
    }
}
