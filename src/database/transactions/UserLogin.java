/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.transactions;

import database.DbConnection;
import database.InformationController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class UserLogin extends DbConnection implements InformationController {

    private String customerId = null;
    private String password = null;

    @Override
    public boolean validInformation() {
        return !(this.customerId == null || this.password == null);
    }

    private boolean isLoginSuccessful() {
        String query = "SELECT customer_no, musteri_no, password FROM user"
                + " WHERE "
                + "customer_no = '" + this.customerId + "'"
                + " OR "
                + "musteri_no = '" + this.customerId + "')"
                + " AND "
                + "password = " + this.password + "'";

        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public AccountInformation getAccountInformation() {
        return AccountInformation.getInstance();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean loginInformationIsTrue() {
        if (validInformation()) {
            if (isLoginSuccessful()) {
                this.getAccountInformation().login(customerId);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
