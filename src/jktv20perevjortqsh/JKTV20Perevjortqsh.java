/**
 * programma prosit vvesti stroku i vqvodit ee naoborot
 * 
 *
 */
package jktv20perevjortqsh;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV20Perevjortqsh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Vvesti stroku: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
 //       System.out.println("str = " +str);
        char[] charStr = str.toCharArray();
 //       System.out.println("charStr = "+Arrays.toString(charStr));
        char[] newCharStr = new char[charStr.length];
        for (int i = 0; i < charStr.length; i++){
            newCharStr[(charStr.length-1)-i]=charStr[i];
        }
 //       System.out.println("newCharStr = "+Arrays.toString(newCharStr));
        String str2 = new String(newCharStr);
        System.out.println("Ctroka naoborot: = "+str2);
        System.out.println("+++++++++++++++++++++");
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Ctroka naoborot: " + sb.reverse().toString());
    }
    
}
