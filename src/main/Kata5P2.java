/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

/**
 *
 * @author carlotapons
 */
public class Kata5P2 {

    /**
     * @param args the command line arguments
     */
    private static final String filename = "email.txt";
    private static List<Mail> mailList;
    private static Histogram<String> histogram;

    public static void main(String[] args) throws IOException {
        execute();
    }

    private static void execute() throws IOException {
        input();
        process();
        output();
    }

    private static void input() throws IOException {
        mailList = MailListReader.read(filename);
    }

    private static void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }

    private static void output(){
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
