/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractClass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

/**
 * You want to read a file in several different ways: some have
 * secret messages, some have information we want to redact
 * @author Jihun
 */
public abstract class AbstractFileReader {
    private final Path filePath;
    protected AbstractFileReader(String filepath){
        this.filePath=Path.of(filepath);
    }
    public String getPath()
    {
        return filePath.toString();
    }
    public  List<String> readFile() throws IOException
    {
        return Files.lines(filePath).map(this::parseLine).collect(Collectors.toList());
    }
    protected abstract String parseLine(String line);
}
