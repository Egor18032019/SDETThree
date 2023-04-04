package models;

public class Skill {
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
