package LabSheet_Solution.PAGE_11_12.Question_2;
public class Student {
    private String name;
    private int stdno;
    private int grade;
    public Student() {
        name = "null";
        stdno = 1;
        grade = 40;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStdno() {
        return stdno;
    }
    public void setStdno(int stdno) {
        this.stdno = stdno;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = (grade < 40)? 40 : grade;
    }
    public char classifyGrade() {
        switch (grade / 10) {
            case 10:
            case 9:
            case 8:
                return 'A';
            case 7:
            case 6:
            case 5:
                return 'B';
        }
        return 'F';
    }
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Student Number: " + stdno);
        System.out.println("Grade: " + grade);
        System.out.println("Corresponding Grade Letter: " + classifyGrade());
    }
}