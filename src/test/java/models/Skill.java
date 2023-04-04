package models;

import lombok.*;

/**
 * Класс содержит ability и его дополнительные свойства
 */
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Skill {
    Ability ability;
    Boolean is_hidden;
    Integer slot;
}
