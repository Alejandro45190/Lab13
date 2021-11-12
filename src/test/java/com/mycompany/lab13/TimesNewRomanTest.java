/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.lab13;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author alexr
 */
public class TimesNewRomanTest {
    
    @Test
    public void testPrint1() {
        String exp = "Times New Roman 12 Strikethrough Bold ";
        Font font = new Bold(new Strikethrough(new TimesNewRoman(12)));
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(result);
        PrintStream current = System.out;
        System.setOut(ps);
        font.print();
        System.out.flush();
        System.setOut(current);
        assertEquals(result.toString(), exp);
    }
    
    @Test
    public void testPrint2() {
        String exp = "Helvetica 15 Bold Italic Underline ";
        Font font = new Underline(new Italic(new Bold( new Helvetica(15))));
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(result);
        PrintStream current = System.out;
        System.setOut(ps);
        font.print();
        System.out.flush();
        System.setOut(current);
        assertEquals(result.toString(), exp);
    }
    
    @Test
    public void testPrint3() {
        String exp = "Calibri 11 Bold Underline ";
        Font font = new Underline(new Bold(new Calibri(11)));
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(result);
        PrintStream current = System.out;
        System.setOut(ps);
        font.print();
        System.out.flush();
        System.setOut(current);
        assertEquals(result.toString(), exp);
    }
    
    @Test
    public void testPrint4() {
        String exp = "Calibri 18 Bold Strikethrough Underline Italic ";
        Font font = new Italic(new Underline(new Strikethrough(
                    new Bold(new Calibri(18)))));
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(result);
        PrintStream current = System.out;
        System.setOut(ps);
        font.print();
        System.out.flush();
        System.setOut(current);
        assertEquals(result.toString(), exp);
    }
    
    @Test
    public void testPrint5() {
        String exp = "Times New Roman 4 ";
        Font font = new TimesNewRoman(4);
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(result);
        PrintStream current = System.out;
        System.setOut(ps);
        font.print();
        System.out.flush();
        System.setOut(current);
        assertEquals(result.toString(), exp);
    }
    
    @Test
    public void testPrint6() {
        String exp = "Helvetica 7 Bold ";
        Font font = new Bold(new Helvetica(7));
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(result);
        PrintStream current = System.out;
        System.setOut(ps);
        font.print();
        System.out.flush();
        System.setOut(current);
        assertEquals(result.toString(), exp);
    }
    
    @Test
    public void testPrint7() {
        String exp = "Helvetica 20 Underline Bold ";
        Font font = new Bold(new Underline(new Helvetica(20)));
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(result);
        PrintStream current = System.out;
        System.setOut(ps);
        font.print();
        System.out.flush();
        System.setOut(current);
        assertEquals(result.toString(), exp);
    }
    
    @Test
    public void testPrint8() {
        String exp = "Calibri 13 Strikethrough Bold ";
        Font font = new Bold(new Strikethrough(new Calibri(13)));
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(result);
        PrintStream current = System.out;
        System.setOut(ps); 
        font.print();
        System.out.flush();
        System.setOut(current);
        assertEquals(result.toString(), exp);
    }
}
