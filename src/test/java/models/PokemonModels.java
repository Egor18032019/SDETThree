package models;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PokemonModels {
    private ArrayList<Opt> abilities;
    private String weight;

}
