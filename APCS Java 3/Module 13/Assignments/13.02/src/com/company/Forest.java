package com.company;


public class Forest extends Terrain {

    private int trees;

    public Forest(int l, int w, int t) {
        super(l, w);
        trees = t;
    }
    public int getTrees()
    {
        return trees;
    }

    public String terrainSize()
    {

        return "Land has dimensions 640 X 480";
    }
}
