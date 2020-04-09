import java.util.Scanner;

public class pert3{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int masuk = input.nextInt();
        for (int i=1;i<=masuk;i++){
            for(int j=1;j<=i;j++){
                System.out.print("#");}
                System.out.println(" ");
                }
                System.out.println("--------");
        for (int a=1;a<=masuk;a++){
                for (int k=masuk;k>=a;k--){
                    System.out.print("#");}                    
                    System.out.println(" ");
                    for(int l=1;l<=a;l++){
                        System.out.print(" ");}
                        }
                }}
            
            
        
    