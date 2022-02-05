package secilenharficikaranprogram;

import java.util.Scanner;
public class SecilenHarfiCikaranProgram {
 
public static void main(String[] args) {
// TODO Auto-generated method stub
System.out.println("Bir kelime giriniz :");
        Scanner girdi= new Scanner(System.in);
        String kelime= girdi.nextLine();
        for(int i=0;i<kelime.length();i++)
        {
            if(kelime.charAt(i)!='a') //a harfinin cikarildigi yer
            {
                System.out.print(kelime.charAt(i)); 
                girdi.close();
            }
        }
}
 
}

