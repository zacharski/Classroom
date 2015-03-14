package org.zacharski;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Classroom cs350 = new Classroom("xp.csv");

        // check average
        if (cs350.average() == 989){
            System.out.println("Average Works");
        }
        else{
            System.out.println("Average Does Not Work");
        }

        // check bestStudent

        if (cs350.bestStudent().equals("TylaDubya")){
            System.out.println("bestStudent Works");
        }
        else{
            System.out.println("bestStudent Does Not Work");
        }


        // check worstStudent

        if (cs350.worstStudent().equals("Kajind")){
            System.out.println("worstStudent Works");
        }
        else{
            System.out.println("worstStudent Does Not Work");
        }

        // check averageForSeciton

        if ((cs350.averageForSection(1) == 962) && (cs350.averageForSection(2) == 1011)){
            System.out.println("AverageForSection Works");
        }
        else{
            System.out.println("AverageForSection Does Not Work");
        }

    }
}
