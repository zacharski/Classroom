package org.zacharski;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


/**
 * Created by raz on 3/14/15.
 */
public class Classroom {


    public class Student{
        public String avatar;
        public int section;
        public int xp;


        public Student(String avatarName, int section, int xp){
            this.avatar = avatarName;
            this.section = section;
            this.xp = xp;
        }
    }


    ArrayList<Student> students;


    public Classroom(String filename){
        students = new ArrayList<Student>();
        String line;
        File file = new File(filename);
        try {
            Scanner sc = new Scanner(file);
            String start = sc.nextLine();
            while (sc.hasNext()) {
                line = sc.nextLine();
                System.out.println(line);
                String[] fields = line.split(",");
                int section = Integer.parseInt(fields[1]);
                int score = Integer.parseInt(fields[2]);
                students.add(new Student(fields[0], section, score));
            }
        } catch (FileNotFoundException e) {
            System.out.println(filename);
            e.printStackTrace();
        }

        // just for feedback I will display the recorded xp
        for (Student student : students){
            System.out.printf("%50s: %5d\n", student.avatar, student.xp);
        }
     }


    public int average(){
        //TO DO return the average xp
        return 0;
    }



    public String bestStudent(){
        //TO DO return the avatar name of the student with the highest xp
        return  "";

    }


    public String worstStudent(){
        //TO DO return the avatar name of the student with the highest xp
        return  "";

    }



    public int averageForSection(int section){
        //TO DO return the average xp for the given section
        return  0;

    }





}
