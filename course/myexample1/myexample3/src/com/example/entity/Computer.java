package com.example.entity;

import java.sql.SQLOutput;
import java.util.Optional;

public class Computer {
    private Soundcard soundcard;

    public Computer(Soundcard soundcard) {
        this.soundcard = soundcard;
    }

    public Computer() {
    }

    public Soundcard getSoundcard() {
        return soundcard;
    }

    public void setSoundcard(Soundcard soundcard) {
        this.soundcard = soundcard;
    }

    public static void getVersion(Computer com){
        Optional.ofNullable(com)
                .ifPresent(c -> System.out.println(c.getSoundcard().getUsb().getVersion()));
    }
}
