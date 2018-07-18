package com.company;


public class WinterMountain extends Mountain {

    private int mountains;
    private int temp;

    public WinterMountain(int l, int w, int m, int t) {
        super(l, w, m);
        mountains = m;
        temp = t;
    }
    public int getTemp()
    {
        return temp;
    }

    public int getMountains()
    {
        return mountains;
    }

    public String terrainSize()
    {

        return "Land has dimensions 800 X 600";
    }
}
