package totorobank.model;

import edu.sit.cs.db.CSDbDelegate;
import java.util.HashMap;
/**
 *
 * @author Kitsune
 */
public class login {
    private String username;
    private String password;
    CSDbDelegate db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G1", "csc105_2014", "csc105");
    
    public login(String user , String pass)
    {
        this.username = user;
        this.password = pass;
    }
    
    public boolean sqlCheck()
    {
        db.connect();
        String sql = "SELECT `username`, `password` FROM `ToIBank_AccLogin` WHERE `username` ='"+username+"'";
        HashMap data = db.queryRow(sql);
        String name = (String) data.get("username");
        String pass = (String) data.get("password");
        db.disconnect();
        return username.equals(name) && password.equals(pass);       
    }
    
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
