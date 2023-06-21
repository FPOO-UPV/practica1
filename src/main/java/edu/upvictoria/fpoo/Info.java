package edu.upvictoria.fpoo;

public class Info {
    private String desc;
    private Integer value;
    private Integer scoredValue;

    public Info(String desc, Integer value, Integer scoredValue) {
        this.desc = desc;
        this.value = value;
        this.scoredValue = scoredValue;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getScoredValue() {
        return scoredValue;
    }

    public void setScoredValue(Integer scoredValue) {
        this.scoredValue = scoredValue;
    }
}
