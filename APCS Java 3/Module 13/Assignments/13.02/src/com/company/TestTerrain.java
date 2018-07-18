package com.company;


public class TestTerrain {

    public static void main(String [] args){
        Terrain one = new Terrain(1800, 1500);
        Forest two = new Forest(640, 480, 56);
        Mountain three = new Mountain(1150, 756, 76);
        WinterMountain four = new WinterMountain(800, 600, 25, 9);

        System.out.println("F0rest Land has dimensions " + two.terrainSize());
        System.out.println("Mountain Land has " + two.getTrees() + " Mountains");
        System.out.println("Mountain Land has dimensions " + two.terrainSize());
        System.out.println("Mountain Land has " + three.getMountains() + " Mountains");
        System.out.println("Winter Land has dimensions " + four.terrainSize());
        System.out.println("Winter Mountain Land has " + four.getMountains() + " Mountains");
        System.out.println("Winter Mountain Land is " + four.getTemp() + " Degrees");
    }
}
