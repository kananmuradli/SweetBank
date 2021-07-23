/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.transactions;

import database.DbDataCenter;
import database.InformationController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class AccountInformation extends DbDataCenter implements InformationController {

    /*
    *Singleton
     */
    private static AccountInformation accountInformation = null;

    public static AccountInformation getInstance() {
        if (accountInformation == null) {
            accountInformation = new AccountInformation();
        }
        return accountInformation;
    }

    public void login(String customerId) {
        this.buyUser(customerId);
        this.buyBalance();
        this.buyBill();
    }

    private void buyUser(String customerId) {
        String query = "SELECT * FROM user WHERE "
                + "customer_no = '" + customerId + "'"
                + " OR"
                + "musteri_no = '" + customerId + "'";

        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                super.userId = rs.getInt("user_id");
                super.nameSurname = rs.getNString("name_surname");
                super.customerNo = rs.getNString("customer_no");
                super.phoneNo = rs.getNString("phone_no");
                super.musteriNo = rs.getNString("musteri_no");
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccountInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void buyBalance() {
        if (this.validInformation()) {
            String query = "SELECT * FROM user_balance"
                    + " WHERE "
                    + "user_id = '" + super.getUserId() + "'";

            try {
                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while (rs.next()) {
                    super.balance = rs.getDouble("balance");
                }

            } catch (SQLException ex) {
                Logger.getLogger(AccountInformation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void buyBill() {
        if (this.validInformation()) {
            String query = "SELECT * FROM user_bill"
                    + " WHERE "
                    + "user_id = '" + super.getUserId() + "'";

            try {
                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while (rs.next()) {
                   super.elekBill = rs.getDouble("electric");
                   super.waterBill = rs.getDouble("water");
                   super.gasBill = rs.getDouble("gas");
                   super.internetBill = rs.getDouble("internet");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccountInformation.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    @Override
    public boolean validInformation() {
        return !(super.userId == 0);
    }

    @Override
    public AccountInformation getAccountInformation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
