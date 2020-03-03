package com.example.entity;

public class Soundcard {
    private USB usb;

    public Soundcard(USB usb) {
        this.usb = usb;
    }

    public Soundcard() {
    }

    public USB getUsb() {
        return usb;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }
}
