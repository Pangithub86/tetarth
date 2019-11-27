/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author Pan
 */
public class JavaApplication21 {
    static void swap(int a,int b){
    int temp;
    temp=a;
    a=b;
    b=temp;
        System.out.println("a: "+a+", b:"+b);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int x=45,y=20;
     swap(x,y);
   
        
        
    }
    
}
