package com.entertainment.client;

import com.entertainment.Television;

class TelevisionMuteTest {

    public static void main(String[] args) {
        Television tv = new Television("LG", 69);
        System.out.println(tv);

        tv.mute();                  //mute it
        System.out.println(tv);

        tv.mute();                  //unmute it
        System.out.println(tv);

        tv.mute();                  //mute it again
        System.out.println(tv);

        tv.setVolume(50);           //sets volume to 50 and unmutes it
        System.out.println(tv);
    }

}