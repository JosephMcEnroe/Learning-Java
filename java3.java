import java.io.*;
public class java3 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));

        //array
        String questionsArray[] = {"What is your name?", "What is the name of your first pet?","What was your first pet?"};
        String bioArray[] = new String[3];
         
        //variables
        int count;
        System.out.println(bioArray.length);
        
        //Questions Loop
        for (count= 0; count<=questionsArray.length; count++);//loop problem c
        {   String x = "x"; 
            System.out.println(questionsArray[count]+": ");
            //x = reader.readLine();
            //bioArray[count]= x;
            
        }
        
        //System.out.println(bioArray[1]);


    }
    
}
