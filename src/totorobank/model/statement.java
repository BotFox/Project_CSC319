package totorobank.model;
/**
 * @author Kitsune
 */
public class statement {
    private String accdeposite;
    private String accwithdraw;
    private String time;
    private double amount;
    private double accdeposite_balance;
    private double accwithdraw_balance;
    
    public statement(String accdeposite,String accwithdraw,String time,double amount,double accdeposite_balance,double accwithdraw_balance)
    {
        this.accdeposite = accdeposite;
        this.accwithdraw = accwithdraw;
        this.time = time;
        this.amount = amount;
        this.accdeposite_balance = accdeposite_balance;
        this.accwithdraw_balance = accwithdraw_balance;
    }
    
    /**
     * @return the accdeposite
     */
    public String getAccdeposite() {
        return accdeposite;
    }

    /**
     * @param accdeposite the accdeposite to set
     */
    public void setAccdeposite(String accdeposite) {
        this.accdeposite = accdeposite;
    }

    /**
     * @return the accwithdraw
     */
    public String getAccwithdraw() {
        return accwithdraw;
    }

    /**
     * @param accwithdraw the accwithdraw to set
     */
    public void setAccwithdraw(String accwithdraw) {
        this.accwithdraw = accwithdraw;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the accdeposite_balance
     */
    public double getAccdeposite_balance() {
        return accdeposite_balance;
    }

    /**
     * @param accdeposite_balance the accdeposite_balance to set
     */
    public void setAccdeposite_balance(double accdeposite_balance) {
        this.accdeposite_balance = accdeposite_balance;
    }

    /**
     * @return the accwithdraw_balance
     */
    public double getAccwithdraw_balance() {
        return accwithdraw_balance;
    }

    /**
     * @param accwithdraw_balance the accwithdraw_balance to set
     */
    public void setAccwithdraw_balance(double accwithdraw_balance) {
        this.accwithdraw_balance = accwithdraw_balance;
    }
   
}
