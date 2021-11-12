package com.mycompany.lab13;

public class Bold extends Decorator {
    
    public Bold (Font font) {
        super(font);
    }
    
    @Override
    public void print() {
        font.print();
        System.out.print("Bold ");
    }
}
