package totorobank.model;

import edu.sit.cs.db.CSDbDelegate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Kamiyama
 */
public class ETC_Service {

    public String generateCaptcha() {
        Random random = new Random();
        int length = 5;
        StringBuffer captchaStringBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int captchaNumber = Math.abs(random.nextInt()) % 60;
            int charNumber = 0;
            if (captchaNumber < 26) {
                charNumber = 65 + captchaNumber;
            } else if (captchaNumber < 52) {
                charNumber = 97 + (captchaNumber - 26);
            } else {
                charNumber = 48 + (captchaNumber - 52);
            }
            captchaStringBuffer.append((char) charNumber);
        }

        return captchaStringBuffer.toString();
    }
    
    public boolean checkCaptcha(String a, String b)
    {
        return a.equals(b);
    }
    
    public boolean checkBalance(double a, double b)
    {
        return  (a-b) >= 0;
    }
    
    public String generateAcc()
    {
        Random rand = new Random();
        String number = "";
        for(int i = 0 ; i <= 9 ; i++)
        {
            int a = rand.nextInt(10);
            number += a;
        }
        return number;
    }
   
    
}
