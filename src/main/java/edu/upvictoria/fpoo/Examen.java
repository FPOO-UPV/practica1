package edu.upvictoria.fpoo;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Examen extends Actividad{
    public Examen(Integer value, LocalDateTime dueDate, Integer unit, File file) {
        super(value,dueDate,unit,file);
    }

    public Examen(Integer value, LocalDateTime dueDate, Integer unit, String path) {
        super(value,dueDate,unit,path);
    }

    public void loadAnswerGrades(ArrayList<Integer> answerGradesList) {
        if (this.rubric.getRubricSize() == answerGradesList.size()) {
            int k = 0;
            for (var value : this.rubric.getCriteria().entrySet()) {
                value.getValue().setScoredValue(answerGradesList.get(k));
                k++;
            }
        }
    }

    public void calculateScoreFromFile() {
        if (this.activityDirectory.exists() && this.activityDirectory.getName().endsWith("csv")) {
            for (var value : this.rubric.getEntrySet()) {
                this.activityScore += value.getValue().getScoredValue();
            }
        }
    }

    public void loadRubricFromFile() {
        var reader = new Lector(this.activityDirectory);
        var arr = reader.getFileContent(this.activityDirectory);
        for (var line : arr) {
            var aux_arr = new ArrayList<String>();
            var strTokenizer = new StringTokenizer(line,",");
            while (strTokenizer.hasMoreTokens())
                aux_arr.add(strTokenizer.nextToken());
            this.rubric.getCriteria().put(aux_arr.get(0),new Info(aux_arr.get(1),Integer.parseInt(aux_arr.get(2)),Integer.parseInt(aux_arr.get(3))));
        }
        // save to disk
    }


    @Override
    public void evaluate() {
        if (!this.rubric.getCriteria().isEmpty()) {
            for (var value : this.rubric.getCriteria().entrySet()) {
                this.activityScore += value.getValue().getScoredValue();
            }
        }
    }
    @Override
    public void saveToDisk() {

    }

    @Override
    public void readActFromDisk() {

    }
}