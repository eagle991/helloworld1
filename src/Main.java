package org.example;

import org.example.classes.Gryffindor;
import org.example.classes.Ravenclaw;
import org.example.classes.Hufflepuff;
import org.example.classes.Slytherin;

public class Main {
    public static void main(String[] args) {
        Slytherin[] Slytherin = {
                new Slytherin("1", "2", "3", "4", "5", "6")
                new Slytherin("7", "8", "9", "10", "11", "12")
                new Slytherin("13", "14", "15", "16", "17", "18")
        };
        Gryffindor[] Gryffindor = {
                new Gryffindor("19", "20", "21", "22", "23", "24")
                new Gryffindor("25", "26", "27", "28", "29", "30")
                new Gryffindor("31", "32", "33", "34", "35", "36")
        };
        Ravenclaw[] Ravenclaw = {
                new Ravenclaw("йц", "ук", "ке", "ен", "нг", "гш", )
                new Ravenclaw("фы", "ва", "ап", "пр", "ро", "ол", )
                new Ravenclaw("яч", "см", "ми", "ит", "ит", "ьб", )
        };
        Hufflepuff[] Hufflepuff = {
                new Hufflepuff("йу", "цк", "уе", "кн", "ег", "нш")
                new Hufflepuff("фв", "ыа", "вп", "ар", "по", "рл")
                new Hufflepuff("яс", "чм", "си", "мт", "иь", "тб")
        };


        System.out.println(studentsSlytherin[0].toString())
        System.out.println(studentsGryffindor[0].toString())
        System.out.println(studentsRavenclaw[0].toString())
        System.out.println(studentsHufflepuff[0].toString())

        org.example.classes.Hogwarts.comparingStudents(studentSlytherin[0], studentSlytherin[0]);
        Slytherin.comparingStudents(studentSlytherin[0], studentSlytherin[1]);
    }
}

