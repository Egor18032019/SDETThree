package models;

/**
 * Класс описывает ability (name и url)
 */
public class Ability {
    /**
     * Название абилики у покемона
     */
    private String name;
    /**
     * url который ведет на страницу с полным описание этой абилки
     */
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
