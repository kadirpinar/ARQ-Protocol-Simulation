/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datalinkk;

/**
 *
 * @author Kadir
 */
public class Goback {
 static  int[] array = new int[15];
    public int x;
public static void  frame(int x){
    
        System.out.println("|-------->|frame:"+x);    
}
    public static void ack(int x){
        System.out.println("|<--------|frame:"+x);    

    }
    public static void  timeout(int x){
        System.out.println("|----X----|:timeout");
        
}
    public static void main(String[] args) {
          int counter=0;
          int counterr=0;
          int ct=0;

          int  window=5;
          int  error=6;
          int a=0;
          int temp;
                      int x;

       for(int i=1;i<13;i++){
            counter++;
             counterr++;
             x=i;
            if(counter==window){
                x=x-4;
                for(int j=1;j<5;j++){
             
                ack(x);
                x++;
                }
                counter=1; 
         ct++;
            }
            if(counterr==error) {timeout(x); counterr=0; a=i; 
            }
         
       
            else  if(ct==2){ x=a;  
            frame(x);
            a++;
            }
            else frame(x);
        }

    }
    
}
