package Test;

public class Student {
    private String Name;
    private int codeOfSTU;
    private int year;
    private int score;

    public Student(int codeOfSTU, int year, int score) {
        this.codeOfSTU = codeOfSTU;
        this.year = year;
        this.score = score;
    }

    public Student() {}

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", codeOfSTU=" + codeOfSTU +
                ", year=" + year +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return Name;
    }

    public Student setName(String name) {
      Name=name;
        return this;
    }

    public int getCodeOfSTU() {
        return codeOfSTU;
    }

    public Student setCodeOfSTU(int codeOfSTU) {
        this.codeOfSTU = codeOfSTU;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Student setYear(int year) {
        this.year = year;
        return this;
    }

    public int getScore() {
        return score;
    }

    public Student setScore(int score) {
        this.score = score;
        return this;
    }
}
