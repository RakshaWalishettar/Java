package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.HiMirror;
import com.xworkz.Connection.internal.SmartMirror;

public class HiMirrorRunner {
    public static void main(String[] args) {
        SmartMirror mirror = new HiMirror();
        mirror.showTime();
        mirror.displayNews();
        mirror.displayWeather();
        mirror.sensitative();
    }
}
