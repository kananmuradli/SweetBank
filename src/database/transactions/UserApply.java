package database.transactions;

import database.DbConnection;
import database.InformationController;
import gui.settings.TextSettings;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserApply extends DbConnection implements InformationController {

    private String nameSurname = null, customerNo = null, phoneNo = null;
    private String securityQuestion = null, securityAnswer = null;

    private String musteriNo = null;
    private String password = null;
    public boolean onlyOneMusteriNo;

    @Override
    public boolean validInformation() {
        return !(this.nameSurname == null
                || this.customerNo == null
                || this.phoneNo == null
                || this.securityQuestion == null
                || this.securityAnswer == null
                || this.musteriNo == null
                || this.password == null
                || TextSettings.minMaxLenght(11, this.customerNo)
                || TextSettings.minMaxLenght(11, this.phoneNo));
    }

    public boolean applyApproval() {
        if (this.validInformation()) {
            if (this.onlyOneCustomerNo()) {
                return false;
            } else {
                this.basvuruyuOnayla();
                return true;
            }
        } else {
            return false;
        }
    }

    public boolean onlyOneMusteriNo() {
        String query = "SELECT musteri_no FROM user WHERE musteri_no =" + this.musteriNo;
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserApply.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private boolean onlyOneCustomerNo() {
        String query = "SELECT customer_no FROM  user WHERE customer_no = " + this.customerNo;
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserApply.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void basvuruyuOnayla() {
        String query = "INSERT INTO user(musteri_no, password,"
                + "name_surname, customer_no, phone_no, security_question, security_answer)"
                + " VALUES("
                + "'" + this.musteriNo + "',"
                + "'" + this.password + "',"
                + "'" + this.nameSurname + "',"
                + "'" + this.customerNo + "',"
                + "'" + this.securityQuestion + "',"
                + "'" + this.securityAnswer + "'"
                + ")";
        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(UserApply.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public AccountInformation getAccountInformation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
