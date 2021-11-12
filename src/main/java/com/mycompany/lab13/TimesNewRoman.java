package com.mycompany.lab13;

public class TimesNewRoman implements Font {
    
    int size;

    public TimesNewRoman(int size) {
        this.size = size;
    }
    
    @Override
    public void print() {
        System.out.print("Times New Roman " + size + " ");
    }
}
