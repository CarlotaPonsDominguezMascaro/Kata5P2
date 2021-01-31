/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import model.Histogram;
import model.Mail;

/**
 *
 * @author carlotapons
 */
public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Mail> mailList){
        Histogram<String> histo = new Histogram();
        for (Mail mail : mailList) {
            histo.increment(mail.getDomain());
        }
        
        return histo;
    }
    
     
}
