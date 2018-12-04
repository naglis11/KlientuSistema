import java.util.Date;
import java.util.*;
import java.text.*;

 	
public class Data {

   public static void main(String args[]) {
      
  
      Date dabartineData = new Date();
     
      SimpleDateFormat ft = new SimpleDateFormat ("y M d");// nurodome datos formata, kurio norime. jei vietoj M rasome MMM, ismeta menesi zodziais
     
      String dabartineDataTekstu = ft.format(dabartineData);
      
      System.out.println(dabartineDataTekstu);
      
      
      
      
      
      
   }
}

