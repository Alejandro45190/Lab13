package com.mycompany.lab13;

public abstract class Decorator implements Font {
    
    protected final Font font;
    
    public Decorator(Font font) {
        this.font = font;
    }
}
