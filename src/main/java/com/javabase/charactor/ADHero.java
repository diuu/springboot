package com.javabase.charactor;

public class ADHero extends Hero implements AD{
    @Override
    public void physicAttack() {
        System.out.printf ("进行物物理攻击");
    }

}
