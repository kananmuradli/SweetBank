/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import database.transactions.AccountInformation;

/**
 *
 * @author user
 */
public interface InformationController {
    
    public boolean validInformation();
        
    public AccountInformation getAccountInformation();
    
}
