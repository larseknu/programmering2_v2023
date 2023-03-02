package no.hiof.larseknu.lambda;

public class Superhero {
    private String name, realName;
    private int age;

    public Superhero(String name, String realName) {
        this(name, realName, 0);
    }

    public Superhero(String name, String realName, int age) {
        this.name = name;
        this.realName = realName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + realName + " - " + (age == 0 ? "Unknown" : age);
    }

}
