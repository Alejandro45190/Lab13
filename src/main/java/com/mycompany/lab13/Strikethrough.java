package com.mycompany.lab13;

public class Strikethrough extends Decorator{
    
    public Strikethrough (Font font) {
        super(font);
    }
    
    @Override
    public void print() {
        font.print();
        System.out.print("Strikethrough ");
    }
}
