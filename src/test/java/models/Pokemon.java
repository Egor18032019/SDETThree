package models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Pokemon {
    /**
     * Имя покемона
     */
    private String name;
    /**
     * url который ведет на страницу с полным описание этого покемона
     */
    private String url;

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
