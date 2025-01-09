package gf.code_practice;

import java.util.ArrayList;

public class Test_RemoveDigit_SymbolsAndSort {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("@AviPawar@0808");
        System.out.println("List is : "+ al);
        
        for(int i=0;i<al.size();i++) {
            String str = al.get(i);

            char ch[] = str.toCharArray();
            String newString = "";

            for(int j=0;j<ch.length; j++) {
                if(ch[j]>='a' && ch[j]<='z' || ch[j]>='A' && ch[j]<='Z') {
                    newString = newString + ch[j];
                }
            }
            al.set(i, newString.toLowerCase());
        }
        System.out.println("New String is : ");
        System.out.println(al);
    }
}
