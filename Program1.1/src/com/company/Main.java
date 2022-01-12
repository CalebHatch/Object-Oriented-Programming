package com.company;

public class Main {

    public static void main(String[] args) {
        String newLine = System.getProperty("line.separator");

        var name = "Caleb Hatch";
        var course = "CIT260";
        var section = "-03";
        var homeTown = "Salt Lake City, Utah";
        var dessert = "Pecan Pie";

        {
            System.out.println(name + newLine + course + section + newLine + homeTown + newLine + dessert);
        }
    }
}
