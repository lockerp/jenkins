/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myjava;

/**
 *
 * @author Dongsheng Huang (michael)
 */

import java.util.*;

public class MathOperatorReturn {
               
      public static String OperatorReturn(int num1,int num2,int num3)
      {   
            String   str="";
          try{          
            if ((num1+num2)==num3)
                      {  str=str.concat("+");}
            if ((num1-num2)==num3)
                      {str=str.concat("-");}            
            if ((num1*num2)==num3)
                       {str=str.concat("*");}
            if (((num1/num2)==num3)&((num1%num2)==0))
               { if (num2!=0)
                       {str=str.concat("/");}
                 else 
                  {throw new ArithmeticException("Divisionby zero");}
                }
              }//end of try
          
          catch (ArithmeticException e)
             { System.out.println(""); }       
                           
          finally
          {//if (((num1+num2)!=num3)&((num1-num2)!=num3)&((num1*num2)!=num3)
                //   &((num1/num2)!=num3)||(((num1/num2)==num3)&((num1%num2)!=0)))
                          if (num2==0)
                                 { 
                                     if (str.equals(""))
                                             str=str.concat("None");
                                 }
                            else
                                 { if (str.equals(""))
                                         str=str.concat("None");}
                       
          }                                      
            return "\""+str+"\"";
            
      }// end of method operatorReturn
            
      public static void main(String args[])
   {
           int[] numbers=new int[3];
           Scanner sc = new Scanner(System.in);  // Create a Scanner object
           System.out.println("Enter three intergers one by one pls, press Enter key after each entry ");
            int i=0;
            while (i<=2)
                {                    
                     try{
                           numbers[i]=Integer.parseInt(sc.nextLine());
                                  i++;                                                                                    
                        }
                      catch(NumberFormatException  e)
                       {System.out.println("Please Enter Valid Integer");}  
                }
                                                        
           System.out.println("The math operator satisfying condition  is  "
                   +OperatorReturn(numbers[0],numbers[1],numbers[2]));
   }    
      
}



        
