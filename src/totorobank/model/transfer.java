package totorobank.model;

import edu.sit.cs.db.CSDbDelegate;
import static totorobank.model.account.getBalance;

/**
 *
 * @author Kamiyama
 */
public class transfer implements Interface_Service {

    CSDbDelegate db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G1", "csc105_2014", "csc105");

    @Override
    public void service(String accID, double money) {
        //
    }

    public void service(String accIDDep, String accIDWit, double money) {
        
        double balanceDep = getBalance(accIDDep);
        balanceDep -= money;
        
        double balanceWit = getBalance(accIDWit);
        balanceWit += money;
        
        db.connect();
        String sql = "INSERT INTO `CSC105_G1`.`ToIBank_Statement` (`statement_number`, `accdeposite`, `accwithdraw`, `amount`, `accde_balance`, `accwi_balance`, `time`) VALUES (NULL, '"+accIDDep+"', '"+accIDWit+"', '"+money+"', '"+balanceDep+"', '"+balanceWit+"', CURRENT_TIMESTAMP);";
        db.executeQuery(sql);

        sql = "UPDATE `ToIBank_Account` SET `Balance`=" + balanceDep + " WHERE `main_AccID` = '" + accIDDep + "'";
        db.executeQuery(sql);
        
        sql = "UPDATE `ToIBank_Account` SET `Balance`=" + balanceWit + " WHERE `main_AccID` = '" + accIDWit + "'";    
        db.executeQuery(sql);
        db.disconnect();
    }
}
