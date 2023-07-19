/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractClass;

import java.io.IOException;

/**
 *
 * @author Jihun
 */
public class Main {
    public static void main(String[] args) throws IOException
    {
        DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader("message.txt");
        System.out.println(digitsOnlyFileReader.readFile());
    }
}
