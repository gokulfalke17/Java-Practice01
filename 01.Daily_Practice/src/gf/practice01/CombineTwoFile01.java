package gf.practice01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CombineTwoFile01 {

    public static void main(String[] args) throws IOException {
        
        PrintWriter pw = new PrintWriter("D:\\Workspaces\\00.core pract\\01.Daily_Practice\\src\\gf\\practice\\file3.txt");
        
        BufferedReader br1 = new BufferedReader(new FileReader("D:\\Workspaces\\00.core pract\\01.Daily_Practice\\src\\gf\\practice\\file1.txt"));
        String line1 = br1.readLine();
        
        BufferedReader br2 = new BufferedReader(new FileReader("D:\\Workspaces\\00.core pract\\01.Daily_Practice\\src\\gf\\practice\\file2.txt"));
        String line2 = br2.readLine();
        
        while (line1 != null || line2 != null) {
            if (line1 != null) {
                pw.println(line1);
                line1 = br1.readLine();
                System.out.println(line1);
            }
            if (line2 != null) { 
                pw.println(line2);
                line2 = br2.readLine(); 
                System.out.println(line2);
            } 

        }
        
        System.out.println("...");
    }
}
