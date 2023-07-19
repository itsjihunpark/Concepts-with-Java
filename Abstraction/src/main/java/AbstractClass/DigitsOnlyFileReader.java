/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractClass;

/**
 *
 * @author Jihun
 */
public class DigitsOnlyFileReader extends AbstractFileReader{
    public DigitsOnlyFileReader(String filePath){
        super(filePath);
    }

    @Override
    protected String parseLine(String line) {
        return line.replaceAll("[^0-9]", "");
    }

    
}
