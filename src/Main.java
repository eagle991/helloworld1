package org.example;

import org.example.classes.Gryffindor;
import org.example.classes.Ravenclaw;
import org.example.classes.Hufflepuff;
import org.example.classes.Slytherin;

public class Main {
    public static void main(String[] args) {
        Slytherin[] studentsSlytherin = {
                new Slytherin("Гарри", "Гарронов", "3", "4", "5", "6"),
                new Slytherin("Рон", "Ронов", "9", "10", "11", "12"),
                new Slytherin("Гермиона", "Геронов", "15", "16", "17", "18")
        };
        Gryffindor[] studentsGryffindor = {
                new Gryffindor("Гарри", "Гарронов", "21", "22", "23", "24"),
                new Gryffindor("Рон", "Ронов", "27", "28", "29", "30"),
                new Gryffindor("Гермиона", "Геронов", "33", "34", "35", "36")
        };
        Ravenclaw[] studentsRavenclaw = {
                new Ravenclaw("Гарри", "Гарронов", "37", "38", "39", "40"),
                new Ravenclaw("Рон", "Ронов", "41", "42", "43", "44"),
                new Ravenclaw("Гермиона", "Геронов", "45", "46", "47", "48")
        };
        Hufflepuff[] studentsHufflepuff = {
                new Hufflepuff("Гарри", "Гарронов", "49", "50", "51", "52"),
                new Hufflepuff("Рон", "Ронов", "53", "54", "55", "56"),
                new Hufflepuff("Гермиона", "Геронов", "57", "58", "59", "60")
        };


        System.out.println(studentsSlytherin[0].toString());
        System.out.println(studentsGryffindor[0].toString());
        System.out.println(studentsRavenclaw[0].toString());
        System.out.println(studentsHufflepuff[0].toString());

        org.example.classes.Hogwarts.comparingStudents(studentSlytherin[0], studentSlytherin[0]);
        Slytherin.comparingStudents(studentSlytherin[0], studentSlytherin[1]);
    }

}


