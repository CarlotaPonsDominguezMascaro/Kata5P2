package view;

import model.Mail;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MailListReaderBD {

    public Connection connect() {

        Connection conn = null;
        try {
            String url = "jdbc:sqlite:Kata5.db";
            conn = DriverManager.getConnection(url);

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        return conn;
    }

    public  List<Mail> read() {
        List<Mail> list = new ArrayList<>();
        String sql = "SELECT * FROM direcc_email";
        try (Connection conn = this.connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String mail = rs.getString("Mail");
                if (isMail(mail)) list.add(new Mail(mail));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public static boolean isMail(String line){
        return line.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");

    }
}
