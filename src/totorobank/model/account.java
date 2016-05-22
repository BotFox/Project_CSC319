package totorobank.model;

import edu.sit.cs.db.CSDbDelegate;
import java.util.HashMap;

/** 
 * @author Kitsune
 */
public class account {

    static boolean getBalance(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String name;
    private String accid;
    private String birthDay;
    private String email;
    private String currency;
    private double balance;
    private int phone;
    CSDbDelegate db;
    
    public account(String name,String accid,String birthDay,String email,String currency,double balance,int phone)
    {
        this.name = name;
        this.accid = accid;
        this.birthDay = birthDay;
        this.email = email;
        this.currency = currency;
        this.balance = balance;
        this.phone = phone;
       
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getAccid() {
        return accid;
    }

    public void setAccid(String accid) {
        this.accid = accid;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrency() {
        return currency;
    }
    
    public void setCurrency(String currency) {
        double money = getBalance();
        String lastcurrency = getCurrency();
        System.out.println("This is old balance "+money);
        System.out.println("This is old currency "+lastcurrency);
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
     public static Double getBalance(String accID)
        {
            CSDbDelegate   db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G1", "csc105_2014", "csc105");
            db.connect();
            String sqlgetBalance = "SELECT `Balance` FROM `ToIBank_Account` WHERE `main_AccID` = "+accID+"";
            HashMap balanceQuery = db.queryRow(sqlgetBalance);
            String balance = (String) balanceQuery.get("Balance");
            Double balancedouble = Double.parseDouble((String) balance);
            db.disconnect();
            return  balancedouble;
        } 
   
}
