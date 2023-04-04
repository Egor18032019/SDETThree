package tests;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import models.Skill;
import models.PokemonModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import requests.AbilitiesPokemonRequests;

import java.util.ArrayList;

/**
 * Тест кейс T1
 * Проверка покемона на вес и умение
 */
public class TestRattataForWeightAndSkill {
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

