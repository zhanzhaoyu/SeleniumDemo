package javaBase.day8;

public class Student {
    private String name;
    private String capital;

    public Student() {
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
