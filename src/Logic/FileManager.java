/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @author Ana Elena Ulate Salas
 ** @date 2017-08-04
 ** 
 **/
public class FileManager {
    //Method 
    public String readTextFile(String fileName) {
        String text = "";
        FileReader file = null;
        String line = "";
        try {
            file = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(file);
            while ((line = reader.readLine()) != null) {
                text += line + "\n";
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not Found");
        } catch (IOException e) {
            throw new RuntimeException("An input/output Error Occurred");
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                }
            }
        }
        return text;
    }
    public void writeTextFile(String fileName, String text) {
        FileWriter output = null;
        try {
            output = new FileWriter(fileName);
            BufferedWriter writter = new BufferedWriter(output);
            output.write(text.replaceAll("\n", "\r\n"));
            writter.close();
        } catch (IOException e) {
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                }
            }
        }
    }
}