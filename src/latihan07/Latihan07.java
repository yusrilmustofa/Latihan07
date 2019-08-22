/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan07;

import static javafx.scene.input.KeyCode.I;

/**
 *
 * @author yusri
 */
public class Latihan07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=12;//dikonversikan ke biner= 0000 1100 
        int y=20;//dikonversikan ke biner=0001 0100
        
        int z;
        z=x&y;
        System.out.println("Hasil operator bitwise AND:"+z);
        
        z=x|y;
        System.out.println("Hasil operator bitwise OR:"+z);
        
        z=x^y;
        System.out.println("Hasil operator bitwise XOR:"+z);
        
        z=~x;
        System.out.println("Hasil operator bitwise NOT:"+z);
        
        z=x>>3;
        System.out.println("Hasil operator bitwise shift left:"+z);
        
        z=x<<2;
        System.out.println("Hasil operaor bitwise shift right:"+z);
        
    }   
}
