
package assignment33;
import java.util.Scanner;

public class Assignment33 {
        
    double add(double a , double b){
        return(a+b);
    }
        
    double subs(double a , double b){
        return(a-b);
    }
        
    double mul(double a , double b){
        return(a*b);
    }
        
     double div(double a , double b){
        return(a/b);
     }
        
       public static void main(String[] args) {
           
           Scanner s=new Scanner(System.in);
           Assignment33 c=new Assignment33();
           double SInput =0;
           double answer =0;
           
           System.out.println("**********************Calculator*************************");
           
           
           System.out.println("");
           System.out.print("Enter the Number:");
             answer = s.nextDouble();
            
            for(;;){
            
                            System.out.print("Operator:");
                                String Operator = s.next();
                            
                        if(Operator.equals("+")){
                            System.out.print("Enter the Number:"); 
                                 SInput = s.nextDouble();
                                 answer=c.add(answer , SInput);
                            System.out.println("Answer:"+answer);
                
                        }else if(Operator.equals("-")){
                            System.out.print("Enter the Number:"); 
                                SInput = s.nextDouble();
                                answer=c.subs(answer , SInput);
                            System.out.println("Answer:"+answer);    
                
                        }else if(Operator.equals("*")){
                            System.out.print("Enter the Number:"); 
                                SInput = s.nextDouble();
                                answer=c.mul(answer , SInput);
                            System.out.println("Answer:"+answer);    
                  
                        }else if(Operator.equals("/")){
                            System.out.print("Enter the Number:"); 
                                SInput = s.nextDouble();
                                answer=c.div(answer , SInput);
                            System.out.println("Answer:"+answer);    
                        }
                    
                            System.out.println("");
                            System.out.print("Exit(Y/N):");
                                String Exit = s.next();
                        if (Exit.equalsIgnoreCase("Y")) {
                            System.out.println("");
                            System.out.println("Thank You for using Programme.....");
                                             break;
                        }else if(Exit.equalsIgnoreCase("N")) {
                                            continue;
                        }
                 }
            }
}
