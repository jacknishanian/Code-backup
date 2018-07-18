package com.company;


public class Mountain extends Terrain {

    private int mountains;


    public Mountain(int l, int w, int m) {
        super(l, w);
        mountains = m;
    }

    public int getMountains()
    {
        return mountains;
    }

    public String terrainSize()
    {

        return "Land has dimensions 1150 X 756";
    }
}
