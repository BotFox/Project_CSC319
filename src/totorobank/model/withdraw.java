package totorobank.model;

import edu.sit.cs.db.CSDbDelegate;
import static totorobank.model.account.getBalance;

/**
 *
 * @author Kamiyama
 */
public class withdraw implements Interface_Service{
         CSDbDelegate db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G1", "csc105_2014", "csc105");
 

        @Override
        public void service(String accID, double money) {
        
         double balance = getBalance(accID);
        balance -= money;
        String sql = "INSERT INTO `ToIBank_Statement`(`accdeposite`, `accwithdraw`, `amount`, `accde_balance`, `accwi_balance`) VALUES ( 'None','"+accID+"',"+money+",0.00,"+balance+")";
        db.connect();
        db.executeQuery(sql);
        db.disconnect();
        
        sql = "UPDATE `ToIBank_Account` SET `Balance`="+balance+" WHERE `main_AccID` = '"+accID+"'";
        db.connect();
        db.executeQuery(sql);
        db.disconnect();
    }
    
}
    