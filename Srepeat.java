/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datalinkkk;

/**
 *
 * @author Kadir
 */
public class Srepeat {
 static  int[] array = new int[15];
     public int x;
public static void  frame(int x){
    
        System.out.println("|-------->|frame:"+x);    
}
    public static void ack(int x){
        System.out.println("|<--------|frame:"+x);    

    }
    public static void  timeout(int x){
        System.out.println("|----X----|:timeout"+x);
        
}
    public static void main(String[] args) {
        int counter=0;
        int counterr=0;
        int ct=0;


        int x;
                int y=0;

         int a = (int)(Math.random()*5+4);
       for(int i=1;i<10;i++){
         counter++;
         counterr++;
           x=i;
       if(counter==3){
           timeout(x);
        array[y]=x;
        x++;
        i++;
        y++;
       }
       if(counterr==4){
            x=x-4;
       for(int j=0;j<4;j++){
           if(x==5) break;
       ack(x);
       x++;
       if(x==3) x++;
       }
       }
       if(a==x){
       frame(array[ct]);
       ct++;
       }
       
       frame(x);
           }
    }
    
}
