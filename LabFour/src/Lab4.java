
import java.util.Scanner;

public class Lab4 {
	
	public static void main(String[] args) {
		  
        
        Scanner sc = new Scanner(System.in);
         
         
         
        String cont = "y";
        while(cont.equalsIgnoreCase("y"))
        {
               
                System.out.println("Enter an Integer: ");
                int userinput = sc.nextInt();     
                 
                
               System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");       
               System.out.println("======" + "  " + "======" + "  " + "======");
                 
        
        for (int i = 1; i <= userinput; i++) { 
        	
        i = userinput;
        int numberSquared = (int) Math.pow(i, 2);
        int numberCubed = (int) Math.pow (i, 3);
         
         
        String message = "\n" + i + "       " + numberSquared + "       " + numberCubed;
         
        System.out.println(message);
        System.out.println();
         
        
        System.out.print("Do you want to continue? (y/n): ");
        cont = sc.next();
        System.out.println();
        
       //System.out.println("Goodbye");
		//sc.close();
         
        }
         
     
         
        }
         
         
         
        }
                
                    }



