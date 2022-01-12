package com.company;

public class Main {

    public static void main(String[] args)
    {
        String newLine = System.getProperty("line.separator");

        var topLine = "     J     A    V     V     A    ";
        var secondLine = "     J    A A    V   V     A A   ";
        var thirdLine = "J    J   AAAAA    V V     AAAAA  ";
        var lastLine = " J  J   A     A    V     A     A ";
        {
            System.out.println(topLine + newLine + secondLine + newLine + thirdLine + newLine + lastLine);
        }
    }
}
