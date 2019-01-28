
package pizzachoice;

import java.util.*;
  import javax.swing.JOptionPane;
public class PizzaChoice {
public static  String [] whatSize = { "S","M","L","X"};
public static  String [] lowercase = { "s","m","l","x"};
public static String size;
public static double[] sizePrice = {6.99, 8.99, 12.50, 15.00};
public static int s;
public static String answer;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
    pizza();
        
        answer = JOptionPane.showInputDialog(null,"Do you want to try again? [Y] [N]","Try Again",JOptionPane.QUESTION_MESSAGE);
        
       if(answer.equals("Y") && answer.equals("y")){
           pizza();
       }else if(answer.equals ("N") && answer.equals ("n")){
           System.out.println("Thank You and come again!");
           System.exit(0);
       }
      
    
       
      
       
   }
    public static void pizza(){
         size = JOptionPane.showInputDialog("Enter Pizza Size  \n S = Small \n M = Medium \n L = Large \n X = Extra Large");
       for(s = 0; s < whatSize.length; s++){
           
           if (size.equals(whatSize[s]) || (size.equals(lowercase[s]))){
           JOptionPane.showMessageDialog(null,"Your Pizza Price is $" +sizePrice[s]);
           }
           
       else{
            for(int a = 0; a < whatSize.length; a++){
           
           if (size.equals(whatSize[a]) || (size.equals(lowercase[a]))){
           JOptionPane.showMessageDialog(null,"Your Pizza Price is $" +sizePrice[a]);
           }             
           }
              
       }
       
       }
    }
}
    

    