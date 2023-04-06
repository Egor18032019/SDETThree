package models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Класс описывает покемона (name и url)
 */
@Setter
@Getter
@ToString
public class Pokemon {
    /**
     * Имя покемона
     */
    private String name;
    /**
     * url который ведет на страницу с полным описание этого покемона
     */
    private String url;
}
