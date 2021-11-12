package com.mycompany.lab13;

public class Calibri implements Font {
    
    int size;

    public Calibri(int size) {
        this.size = size;
    }
    
    @Override
    public void print() {
        System.out.print("Calibri " + size + " ");
    }
}
