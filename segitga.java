/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labti;

/**
 *
 * @author wijay
 */
public class segitga {
 
public static void main (String[] args) {
    int n = 3;
    for(int i=1; i<=n; i++) {
    for(int j=n; j>i; j--) {
    System.out.print(" ");
 }
    for(int k=1; k<=i; k++) {
    System.out.print("* ");
 }
    System.out.println();
}
}
}
