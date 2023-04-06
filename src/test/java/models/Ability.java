package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Класс описывает ability (name и url)
 */
@Setter
@Getter
@ToString
public class Ability {
    /**
     * Название абилики у покемона
     */
    private String name;
    /**
     * url который ведет на страницу с полным описание этой абилки
     */
    private String url;
}
