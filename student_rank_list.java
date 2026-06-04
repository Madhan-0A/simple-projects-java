//student rank list using selection sort

//create a class with student details

import java.util.*;
import java.util.Scanner;

class student {
    int id;
    String name;
    int mark;

    // constructor
    student(int id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
}

// creat the list to add student details
public class student_rank_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();

        // create student list

        List<student> stu = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + ".Enter the student id: ");
            int id = sc.nextInt();

            System.out.println(i + 1 + ".Enter the student name: ");
            String name = sc.next();

            System.out.println(i + 1 + ".Enter the student mark: ");
            int mark = sc.nextInt();

            stu.add(new student(id, name, mark));
        }

        // sort the student list using selection sort
        selectionSort(stu);

        // print rank list
        System.out.println("\n--- Student Rank List ---");
        for (int i = 0; i < stu.size(); i++) {
            student s = stu.get(i);
            System.out.println("Rank " + (i + 1) + ": " + s.name + " (ID: " + s.id + ") - Mark: " + s.mark);
        }
    }

    // sort the student list using selection sort
    public static void selectionSort(List<student> stu) {
        for (int i = 0; i < stu.size() - 1; i++) {
            int max = i;
            for (int j = i + 1; j < stu.size(); j++) {
                if (stu.get(j).mark > stu.get(max).mark) {
                    max = j;
                }
            }
            // Swap
            student temp = stu.get(i);
            stu.set(i, stu.get(max));
            stu.set(max, temp);

            /*
             * list = [10,20,15,5]
             * 
             * 1.temp = stu.get(i);
             * 2.stu.set(i, stu.get(maxindex));
             * 3.stu.set(maxindex, temp);
             * 
             * 1.temp = 10;
             * i=0; [10,20,15,5]
             * 2.stu.set(0,20), [20,20,15,5]
             * 3.stu.set(maxindex,temp), [20,10,15,5]
             * 
             * 1.temp = 10;
             * i=1; [20,10,15,5]
             * 2.stu.set(1,15), [20,15,15,5]
             * 3.stu.set(maxindex,temp), [20,15,10,5]
             * 
             * 1.temp = 10;
             * i=2; [20,15,10,5]
             * 2.stu.set(2,10), [20,15,10,5]
             * 3.stu.set(maxindex,temp), [20,15,10,5]
             * 
             */


        }
    }
}
