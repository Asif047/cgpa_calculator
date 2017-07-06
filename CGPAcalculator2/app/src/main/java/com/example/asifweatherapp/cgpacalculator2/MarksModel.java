package com.example.asifweatherapp.cgpacalculator2;

/**
 * Created by User on 7/6/2017.
 */

public class MarksModel {
    private double subject1_marks,subject2_marks,subject3_marks,subject4_marks,subject5_marks,subject6_marks,subject7_marks,subject8_marks,subject9_marks;
    private double subject1_credit,subject2_credit,subject3_credit,subject4_credit,subject5_credit,subject6_credit,subject7_credit,subject8_credit,subject9_credit;


    double mark_grade;
    double result;

    public MarksModel(double subject1_marks, double subject2_marks, double subject3_marks, double subject4_marks, double subject5_marks, double subject6_marks, double subject7_marks, double subject8_marks, double subject9_marks, double subject1_credit, double subject2_credit, double subject3_credit, double subject4_credit, double subject5_credit, double subject6_credit, double subject7_credit, double subject8_credit, double subject9_credit) {
        this.subject1_marks = subject1_marks;
        this.subject2_marks = subject2_marks;
        this.subject3_marks = subject3_marks;
        this.subject4_marks = subject4_marks;
        this.subject5_marks = subject5_marks;
        this.subject6_marks = subject6_marks;
        this.subject7_marks = subject7_marks;
        this.subject8_marks = subject8_marks;
        this.subject9_marks = subject9_marks;
        this.subject1_credit = subject1_credit;
        this.subject2_credit = subject2_credit;
        this.subject3_credit = subject3_credit;
        this.subject4_credit = subject4_credit;
        this.subject5_credit = subject5_credit;
        this.subject6_credit = subject6_credit;
        this.subject7_credit = subject7_credit;
        this.subject8_credit = subject8_credit;
        this.subject9_credit = subject9_credit;
    }


    public double getSubject1_marks() {
        return subject1_marks;
    }

    public void setSubject1_marks(double subject1_marks) {
        this.subject1_marks = subject1_marks;
    }

    public double getSubject2_marks() {
        return subject2_marks;
    }

    public void setSubject2_marks(double subject2_marks) {
        this.subject2_marks = subject2_marks;
    }

    public double getSubject3_marks() {
        return subject3_marks;
    }

    public void setSubject3_marks(double subject3_marks) {
        this.subject3_marks = subject3_marks;
    }

    public double getSubject4_marks() {
        return subject4_marks;
    }

    public void setSubject4_marks(double subject4_marks) {
        this.subject4_marks = subject4_marks;
    }

    public double getSubject5_marks() {
        return subject5_marks;
    }

    public void setSubject5_marks(double subject5_marks) {
        this.subject5_marks = subject5_marks;
    }

    public double getSubject6_marks() {
        return subject6_marks;
    }

    public void setSubject6_marks(double subject6_marks) {
        this.subject6_marks = subject6_marks;
    }

    public double getSubject7_marks() {
        return subject7_marks;
    }

    public void setSubject7_marks(double subject7_marks) {
        this.subject7_marks = subject7_marks;
    }

    public double getSubject8_marks() {
        return subject8_marks;
    }

    public void setSubject8_marks(double subject8_marks) {
        this.subject8_marks = subject8_marks;
    }

    public double getSubject9_marks() {
        return subject9_marks;
    }

    public void setSubject9_marks(double subject9_marks) {
        this.subject9_marks = subject9_marks;
    }

    public double getSubject1_credit() {
        return subject1_credit;
    }

    public void setSubject1_credit(double subject1_credit) {
        this.subject1_credit = subject1_credit;
    }

    public double getSubject2_credit() {
        return subject2_credit;
    }

    public void setSubject2_credit(double subject2_credit) {
        this.subject2_credit = subject2_credit;
    }

    public double getSubject3_credit() {
        return subject3_credit;
    }

    public void setSubject3_credit(double subject3_credit) {
        this.subject3_credit = subject3_credit;
    }

    public double getSubject4_credit() {
        return subject4_credit;
    }

    public void setSubject4_credit(double subject4_credit) {
        this.subject4_credit = subject4_credit;
    }

    public double getSubject5_credit() {
        return subject5_credit;
    }

    public void setSubject5_credit(double subject5_credit) {
        this.subject5_credit = subject5_credit;
    }

    public double getSubject6_credit() {
        return subject6_credit;
    }

    public void setSubject6_credit(double subject6_credit) {
        this.subject6_credit = subject6_credit;
    }

    public double getSubject7_credit() {
        return subject7_credit;
    }

    public void setSubject7_credit(double subject7_credit) {
        this.subject7_credit = subject7_credit;
    }

    public double getSubject8_credit() {
        return subject8_credit;
    }

    public void setSubject8_credit(double subject8_credit) {
        this.subject8_credit = subject8_credit;
    }

    public double getSubject9_credit() {
        return subject9_credit;
    }

    public void setSubject9_credit(double subject9_credit) {
        this.subject9_credit = subject9_credit;
    }



    public double getMarkGrade(double mark)
    {

        if(mark<40.0)
            mark_grade=0;
        else if(mark>=40.0&&mark<45.0)
            mark_grade=2.0;
        else if(mark>=45.0&&mark<50.0)
            mark_grade=2.25;
        else if(mark>=50.0&&mark<55.0)
            mark_grade=2.5;
        else if(mark>=55.0&&mark<60.0)
            mark_grade=2.75;
        else if (mark>=60.0&&mark<65.0)
            mark_grade=3.0;
        else if(mark>=65.0&&mark<70.0)
            mark_grade=3.25;
        else if(mark>=70.0&&mark<75.0)
            mark_grade=3.5;
        else if (mark>=75.0&&mark<80.0)
            mark_grade=3.75;
        else
            mark_grade=4.0;

        return mark_grade;

    }

    public double getResult(double mark1,double mark2,double mark3,double mark4,
                            double mark5,double mark6,double mark7,double mark8,double mark9,
                            double credit1,double credit2,double credit3,double credit4,
                            double credit5,double credit6,double credit7,double credit8,double credit9)
    {
        result=((mark1*credit1)+(mark2*credit2)+(mark3*credit3)+(mark4*credit4)+(mark5*credit5)+(mark6*credit6)+(mark7*credit7)+(mark8*credit8)+(mark9*credit9))/(credit1+credit2+credit3+credit4+credit5+credit6+credit7+credit8+credit9);

        return result;
    }




}
