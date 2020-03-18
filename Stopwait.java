/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datalink;

/**
 *
 * @author Kadir
 */
public class Stopwait {
  static  int[] array = new int[15];
    public int x;
public static void  frame(int x){
    
        System.out.println("|\\  |");
        System.out.println("| \\ |");
        System.out.println("|  \\|frame:"+x);    
}
public static int  ack(){
        int a = (int)(Math.random()*5);
        System.out.println("|  /|");
        if( 1==a){
        timeout();
        waitt();
return 1; 
        }
        System.out.println("| / |");
        System.out.println("|/  |");    
        return 0;
}
public static void  timeout(){
        System.out.println("| X |:timeout");
        
}
public static void  waitt(){
        System.out.println("|   |");
        System.out.println("|   |");
        System.out.println("|   |");
}
    public static void main(String[] args) {
      

        for(int i=1;i<10;i++){
            int x = i;
        frame(x);

        if(ack()==1){
        i--;
        }        
        }
       
        // TODO code application logic here
    }
    
}
