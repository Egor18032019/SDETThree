package models;

/**
 * Класс описывает ability (name и url)
 */
public class Ability {
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ability{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
