//Updated Version of Java3
import java.util.Scanner;
public class java4 {
    public static void main(String[] args)
    {
        //Scanner Method
        Scanner scanner = new Scanner (System.in);
   

        //array
        String questionsArray[] = {"What is your name?", "What is the name of your first pet?","What was your first pet?"};
        String bioArray[] = new String[3];
        String sentenceArray[] = {"Your Name is ", "The Name of Your First Pet is ", "Your First Pet was a "};
         
        //variables
        int count;          //Loop Control
        String x;           //holds string value
        boolean check;      //checks if parse is true or false
        
        //Questions Loop
        for(count = 0; count<= questionsArray.length-1; count++)
        {  
            System.out.print(questionsArray[count]+": ");
            x = scanner.next();
            
            bioArray[count]= x;
            System.out.print("\n");
        }
        //Answer Loop
        for(count = 0; count <= bioArray.length-1; count++)
        {
            System.out.println(sentenceArray[count]+ bioArray[count]+".");
        }
    }
    
}
