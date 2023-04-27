package com.javabase.charactor;

//Weapon类在其他包里，使用必须进行import
//import property.Weapon;

public class Hero {

    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    //装备一把武器
    public void equip(Weapon w){

    }
    public  void test(){
        System.out.println ("test");
    }

    public static void main(String[] args) {
        Hero hero = new Hero ();
        ADHero adHero = new ADHero ();
        APHero apHero = new APHero ();
//        hero = adHero;
//        AD ad1 = (AD) hero;
//        AD ad2 = adHero;
//        System.out.println (ad1);
        Hero h1 = adHero;
        Hero h2 = apHero;
        ADHero h3 = (ADHero) h1;
        Hero h4 = h3;
        h3.physicAttack ();
        System.out.println (h1 instanceof APHero);
//
//        ADHero ad = new ADHero();
//        Hero h = ad;
//        h.test ();
////        AD ad1 = (AD) h;
//        AP ad4 = (AP) h;
////        ad1.physicAttack ();
//        ad4.magicAttack ();
////        Hero ad2 = (ADHero);
//
////        AP ad3 = (AP)ad2;
////        APHero ap = (APHero) ad3;
    }

}
