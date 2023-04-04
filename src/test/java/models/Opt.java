package models;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Opt {
    Skill ability;
    Boolean is_hidden;
    Integer slot;


}
/*
{"abilities":
[
{"ability":{
"":"keen-eye","":"https://pokeapi.co/api/v2/ability/51/"},"":false,"slot":1},
{"ability":{"name":"tangled-feet","url":"https://pokeapi.co/api/v2/ability/77/"},"is_hidden":false,"slot":2},
{"ability":{"name":"big-pecks","url":"https://pokeapi.co/api/v2/ability/145/"},"is_hidden":true,"slot":3}],
 */