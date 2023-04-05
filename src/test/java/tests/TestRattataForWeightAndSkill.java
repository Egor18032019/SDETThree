package tests;

import models.PokemonPropertyModel;
import models.Skill;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import requests.PokemonRequests;
import utils.Const;

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
        PokemonPropertyModel pidgeotto = PokemonRequests.getAbilitiesPokemon(Const.pidgeottoName);
        PokemonPropertyModel rattata = PokemonRequests.getAbilitiesPokemon(Const.rattataName);
        int rattataWeight = Integer.parseInt(rattata.getWeight());
        int pidgeottoWeight = Integer.parseInt(pidgeotto.getWeight());
        boolean isWeightRattataLess = rattataWeight < pidgeottoWeight;
        Assertions.assertTrue(isWeightRattataLess, "У" + Const.rattataName + " вес больше чем у " + Const.pidgeottoName);

        ArrayList<Skill> abilities = rattata.getAbilities();
        boolean isHaveRunAway = false;
        for (Skill ability : abilities) {
            String abillityName = ability.getAbility().getName();
            if (abillityName.equals(Const.pokemonAbilitiRunAway)) {
                isHaveRunAway = true;
                break;
            }
        }
        Assertions.assertTrue(isHaveRunAway, "У" + Const.rattataName + " нет умения - " + Const.pokemonAbilitiRunAway);
    }
}

