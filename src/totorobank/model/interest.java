package totorobank.model;

import edu.sit.cs.db.CSDbDelegate;
import java.text.DecimalFormat;

/**
 * @author Kamiyama
 */
public class interest extends deposite{
    
    final private double INTEREST = 3.5;
    
  public  double calcurateInterest(String accID)
    {
        double interestBalance = account.getBalance(accID);
        interestBalance = (interestBalance / 100) * INTEREST;       
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");
        return Double.parseDouble(df.format(interestBalance));
    }
  
  public void service(String accID , double money)
  {           
       CSDbDelegate db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G1", "csc105_2014", "csc105");
        String sql = "UPDATE `ToIBank_Account` SET `Balance`="+money+" WHERE `main_AccID` = '"+accID+"'";
        db.connect();
        db.executeQuery(sql);
        db.disconnect(); 
  }
    
  public double balanceInterest(String accID)
  {
       double updateBalance = account.getBalance(accID) + calcurateInterest(accID);
        return updateBalance;
  }
  
}
