package jobsheet6dynamic;

import java.util.Scanner;

public class Latihan1 {
    private static void tampilJudul(String identitas){
        System.out.println("Identitas: "+identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    public static void main(String[] args) {
        String identitas = "Akbar Baihaqi Putra Aji Pratama/XRPL5/4";
        
        tampilJudul(identitas);   
        int n = tampilInput();
    }
    
    private static int tampilInput(){
        Scanner b = new Scanner (System.in);
        System.out.print("Bilangan ke-: ");
        int n = b.nextInt();
        
        return n;
    }
    
}
