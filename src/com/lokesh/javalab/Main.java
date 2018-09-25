package com.lokesh.javalab;
import java.util.Random;
public class Main {
        // write your code here


            public static void main(String[] args) {
                // write your code here
                numerify("Test###");
                letterify("TEST???");
                bothify("TEST?#");
            }

            public static String letterify(String letterString) {
                if (letterString == null) {
                    return null;
                }
                String alphabets = "abcdefghijklmnopqrstuvwxyz";
                StringBuilder sb = new StringBuilder();
                Random r = new Random();
                int someNum = r.nextInt((26 - 1) + 1) + 1;
                String randomLetter = Character.toString(alphabets.charAt(someNum));

                if (letterString.isEmpty()) {
                    return "";
                }

                for (int i = 0; i < letterString.length(); i++) {
                    if (letterString.charAt(i) == '?') {

                        sb.append(randomLetter);
                    } else {
                        sb.append(letterString.charAt(i));
                    }
                }
                System.out.println(sb.toString());
                return sb.toString();
            }

            public static String numerify(String numberString) {
                if (numberString == null) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < numberString.length(); i++) {
                    Random r = new Random();
                    if (numberString.charAt(i) == '#') {
                        sb.append(r.nextInt((9 - 0) + 1) + 0);
                    } else {
                        sb.append(numberString.charAt(i));
                    }


                }

                System.out.println(sb.toString());
                return sb.toString();
            }


            public static String bothify(String string) {
                StringBuilder sb = new StringBuilder();
                Random r = new Random();
                int someNum = r.nextInt((25 - 0) + 0);
                String alphabets = "abcdefghijklmnopqrstuvwxyz";
                String randomLetter = Character.toString(alphabets.charAt(someNum));
                for (int i = 0; i < string.length(); i++) {

                    if (string.charAt(i) == '#') {
                        sb.append(r.nextInt((9 - 0) + 1) + 0);
                    } else if (string.charAt(i) == '?') {
                        sb.append(randomLetter);
                    } else {
                        sb.append(string.charAt(i));
                    }


                }

                System.out.println(sb.toString());
                return sb.toString();

            }

        }
    }