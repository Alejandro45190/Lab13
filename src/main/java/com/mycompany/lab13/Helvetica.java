package com.mycompany.lab13;

public class Helvetica implements Font {
    
    int size;

    public Helvetica(int size) {
        this.size = size;
    }
    
    @Override
    public void print() {
        System.out.print("Helvetica " + size + " ");
    }    
}
