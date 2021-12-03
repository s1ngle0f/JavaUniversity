package task25_26;

import java.util.ArrayList;
import java.util.Map;

public class Metro {

    private ArrayList<Line> lines;
    private Stations stations;

    public Metro(ArrayList<Line> lines, Stations stations) {
        this.lines = lines;
        this.stations = stations;
    }
}

class Line{
    private int number;
    private String name;
    public Line(int number, String name) {
        this.number = number;
        this.name = name;
    }
}

class Stations{
    private Map<Integer, String[]> stations;
    public Stations(Map<Integer, String[]> stations) {
        this.stations = stations;
    }
}