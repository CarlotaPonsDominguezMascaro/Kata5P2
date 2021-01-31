/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Mail;

/**
 *
 * @author carlotapons
 */
public class MailListReader {

    public static List<Mail> read(String fileName) {
        List<Mail> list = new ArrayList<>();
        try{
            
        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
        while(true){
            String line = reader.readLine();
            
            if(line == null){
                break;
            }
            if(MailParse.isMail(line)){
                list.add(new Mail(line));
            }
        }
    }catch (FileNotFoundException exception){
        System.out.print("No se encuentra"+exception.getMessage());
    
    }catch (IOException exception){
        System.out.print("No se encuentra"+exception.getMessage());
    }
        return list;
    }
    
}
