package sg.edu.rp.c346.id22022260.mymodules;

import java.io.Serializable;

public class Module implements Serializable {
    public String code;
    public String name;
    public int year;
    public int semester;
    public int credits;
    public String venue;

    public Module(String code, String name, int year, int semester, int credits, String venue) {
        this.code = code;
        this.name = name;
        this.year = year;
        this.semester = semester;
        this.credits = credits;
        this.venue = venue;
    }

    public Module(String code, String name, String venue) {
        this.code = code;
        this.name = name;
        this.venue = venue;
        this.year = 2023;
        this.semester = 1;
        this.credits = 4;
    }

    public Module(String code, String name) {
        this.code = code;
        this.name = name;
        this.year = 2023;
        this.semester = 1;
        this.credits = 4;
        this.venue = "W64M";
    }
}
