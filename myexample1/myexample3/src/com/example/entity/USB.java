package com.example.entity;

import java.sql.SQLOutput;
import java.util.Optional;

public class USB {
    private String version;

    public USB(String version) {
        this.version = version;
    }

    public USB() {
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public static void getUSBVersion(USB usb){
        Optional.ofNullable(usb)
                .ifPresent(u -> System.out.println(u.getVersion()));
    }
}
