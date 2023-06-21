package edu.upvictoria.fpoo;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Rubrica {
    private HashMap<String, Info> criteria;
    private File file;

    public Rubrica(File file) {
        this.criteria = new HashMap<String, Info>();
        this.file = file;
    }

    public int getRubricSize() {
        return criteria.size();
    }

    public Set<Map.Entry<String, Info>> getEntrySet() {
        return this.criteria.entrySet();
    }

    public Rubrica(String path) {
        this(new File(path));
    }

    public HashMap<String, Info> getCriteria() {
        return criteria;
    }

    public void setCriteria(HashMap<String, Info> criteria) {
        this.criteria = criteria;
    }
}
