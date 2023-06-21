package edu.upvictoria.fpoo;

import java.io.File;
import java.time.LocalDateTime;

public abstract class Actividad {
    protected Integer value;
    protected Integer activityScore;
    protected LocalDateTime dueDate;
    protected Integer unit;
    protected Rubrica rubric;
    protected File activityDirectory;

    public Actividad(Integer value, LocalDateTime dueDate, Integer unit, File file) {
        this.value = value;
        this.dueDate = dueDate;
        this.unit = unit;
        this.activityScore = 0;
        this.activityDirectory = file;
        this.rubric = new Rubrica(file);
    }

    public Actividad(Integer value, LocalDateTime dueDate, Integer unit, String path) {
        this(value,dueDate,unit,new File(path));
    }

    public abstract void evaluate();
    public abstract void saveToDisk();
    public abstract void readActFromDisk();
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getActivityScore() {
        return activityScore;
    }

    public void setActivityScore(Integer activityScore) {
        this.activityScore = activityScore;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Rubrica getRubric() {
        return rubric;
    }

    public void setRubric(Rubrica rubric) {
        this.rubric = rubric;
    }
}
