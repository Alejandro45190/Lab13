package com.mycompany.lab13;

public class Italic extends Decorator {
    
    public Italic (Font font) {
        super(font);
    }
    
    @Override
    public void print() {
        font.print();
        System.out.print("Italic ");
    }
}
