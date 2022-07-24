import java.io.*;
public class java3 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));

        //array
        String questionsArray[] = {"What is your name?", "What is the name of your first pet?","What was your first pet?"};
        String bioArray[] = new String[3];
        String sentenceArray[] = {"Your Name is ", "The Name of Your First Pet is ", "Your First Pet was a "};
         
        //variables
        int count; //Loop Control
        
        
        //Questions Loop
        for(count = 0; count<= questionsArray.length-1; count++)//LOOP PROBLEM SOLVED LETS GOO
        {  
            System.out.print(questionsArray[count]+": ");
            String x = reader.readLine();
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
