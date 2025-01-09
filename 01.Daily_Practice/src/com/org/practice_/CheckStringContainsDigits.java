package com.org.practice_;

//Q7.How to Check if the String Contains Only Digits

public class CheckStringContainsDigits {

    public static void main(String[] args) {
//        String str = "123456"; 
        String str = "abc123";
        
        boolean flag = true;
        
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                flag = false; 
                break; 
            }
        }
        
        if (flag) {
            System.out.println("String Contains Only Digits...");
        } else {
            System.out.println("String Dose't Contains Only Digits.");
        }
    }
}
