package com.springproject.concepts;

public class PacManGame implements GamingConsole{
    public void up() {
        System.out.println("JUMP");
    }
    public void down() {
        System.out.println("BEND");
    }
    public void left() {
        System.out.println("BACK");
    }
    public void right() {
        System.out.println("EAT");
    }
}
