package com.example.test;

import com.example.entity.Computer;
import com.example.entity.Soundcard;
import com.example.entity.USB;

public class Test {
    public static void main(String[] args) {
        USB usb = new USB("1.0");
        USB usb1 = null;
        Soundcard soundcard = new Soundcard(usb);
        Computer computer = new Computer(soundcard);
        Computer computer1 = null;
        Computer.getVersion(computer1);

        USB.getUSBVersion(computer.getSoundcard().getUsb());
    }
}
