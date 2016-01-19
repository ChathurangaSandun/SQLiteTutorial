package com.clivekumara.sqlitetutorial;

/**
 * Created by chathuranga on 1/18/2016.
 */
public class Marks {

    int sid;
    String name;
    int mark;


    public Marks() {
    }

    public Marks(int sid, String name, int mark) {
        this.sid = sid;
        this.name = name;
        this.mark = mark;
    }

    public Marks(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public int getSid() {
        return sid;
    }



    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
