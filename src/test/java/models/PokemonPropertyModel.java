package models;

import lombok.*;

import java.util.ArrayList;

/**
 * Класс описывает перечень необходимых для тестов свойств покемонов(список абилити и вес)
 */
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PokemonPropertyModel {
    private ArrayList<Skill> abilities;
    private String weight;
}
