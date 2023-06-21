package edu.upvictoria.fpoo;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class App {
    public static void main( String[] args ) {
        var data = "src/main/resources/data/Materia1/ActividadExamen/rubrica.csv";
        LocalDateTime today = LocalDateTime.now();
        var e = new Examen(20,today,1,data);
        var answerScore = new ArrayList<Integer>();
        answerScore.add(1);
        answerScore.add(5);
        answerScore.add(1);
        answerScore.add(3);
        answerScore.add(10);
        e.loadRubricFromFile();
        e.loadAnswerGrades(answerScore);
        System.out.println();
    }
}
