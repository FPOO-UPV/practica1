package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Lector {
    private File file;

    public Lector(File file) {
        this.file = file;
    }

    public Lector(String path) {
        this(new File(path));
    }

    public ArrayList<String> getFileContent(File file) {
        var arr = new ArrayList<String>();
        try {
            var fileReader = new FileReader(file);
            var buffReader = new BufferedReader(fileReader);
            var line = "";
            while ((line = buffReader.readLine()) != null) {
                arr.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr;
    }

    public ArrayList<String> getArrContent(File file) {
        var arr = new ArrayList<String>();
        var reader = new Lector(this.file);
        var aux_arr = reader.getFileContent(this.file);
        var strTokenizer = new StringTokenizer(aux_arr.get(0),",");
        while (strTokenizer.hasMoreTokens()) {
            arr.add(strTokenizer.nextToken());
        }
        return arr;
    }
}
