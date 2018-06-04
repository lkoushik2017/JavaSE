   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.util.Scanner;

/**
 *
 * @author Koushik LR
 */
public class JavaApplication20 {
private static double Ocount;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       
       nonRepWord("ab a ab ");
      
            }
                        
    
    public static void revWord(String sen){
        String[] s=sen.split(" ");
      
        for(int i=0;i<s.length-1;i++){
            for(int j=i+1;j<s.length;j++){
                if(s[i].equals(s[j])){
                  s[j]="";
                }
            }
        }
     
    
        for(int k=0;k<s.length;k++){
            System.out.print(s[k]+" ");
                
            
            
        }
       
    }
    
    public static void toOctal(int num){
        
        
        
        int i=0;
        while(num!=0){
        
           
        
        Ocount=Ocount+((num%8)*Math.pow(10, i));
            
        i++;
        num=num/8;
        }
    } 
    
    public static void nonRepWord(String sen){
        String[] s=sen.split(" ");
        
        
        for(int i=0;i<s.length-1;i++){
            for(int j=i+1;j<s.length;j++){
                if(s[i].equals(s[j])){
                    s[j]="";
                }
            }
        }
        
       for(int k=0;k<s.length;k++){
           System.out.print(s[k]+" ");
       }
    }
    
    public static void bubbleSort(int[] arr){
        int t=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
                
            }
           
        }
    }
    
   
    
}
