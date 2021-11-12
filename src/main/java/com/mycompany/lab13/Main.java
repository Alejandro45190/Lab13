package com.mycompany.lab13;

public class Main {
    
    public static void main(String[] args) {
        
        Font calibri = new Bold(new Underline(new Calibri(11)));
        calibri.print();
        System.out.println();
        Font times = new Strikethrough(new Bold(new TimesNewRoman(12)));
        times.print();
        System.out.println();
        Font helvetica = (new Underline(new Italic(new Bold(new Helvetica(15)))));
        helvetica.print();
    }
}
