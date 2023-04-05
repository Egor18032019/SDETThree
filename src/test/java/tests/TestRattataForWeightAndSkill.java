package tests;

import models.PokemonModel;
import models.Skill;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import requests.AbilitiesPokemonRequests;

import java.util.ArrayList;

/**
 * Тест кейс T1
 * Проверка покемона на вес и умение
 */
public class TestRattataForWeightAndSkill {
    /**
     * Метод вызывает метод getAbilitiesPokemon для получения свойства покемонов  rattata и pidgeotto
     * далее проверяет что у
     * покемона rattata, в отличие от покемона pidgeotto, меньше вес и есть умение
     * (ability) побег (run-away
     */
    @Test
    public void CheckingRattataForWeightAndSkillTest() {

        PokemonModel pidgeotto = AbilitiesPokemonRequests.getAbilitiesPokemon("pidgeotto");
        PokemonModel rattata = AbilitiesPokemonRequests.getAbilitiesPokemon("rattata");
        int rattataWeight = Integer.parseInt(rattata.getWeight());
        int pidgeottoWeight = Integer.parseInt(pidgeotto.getWeight());
        boolean isWeightRattataLess = rattataWeight < pidgeottoWeight;
        Assertions.assertTrue(isWeightRattataLess, "У rattata вес больше чем у pidgeottoWeight");

        ArrayList<Skill> abilities = rattata.getAbilities();
        boolean isHaveRunAway = false;
        for (Skill ability : abilities) {
            String abillityName = ability.getAbility().getName();
            if (abillityName.equals("run-away")) {
                isHaveRunAway = true;
                break;
            }
        }
        Assertions.assertTrue(isHaveRunAway, "У rattata нет умения run-away");
    }
}

