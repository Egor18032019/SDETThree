package tests;

import models.Pokemon;
import models.PokemonLimitModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import requests.PokemonRequests;

import java.util.ArrayList;

/**
 * Тест кейс T2
 * Проверить ограничение списка (limit) покемонов и то, что у каждого покемона в
 * ограниченном списке есть имя (name)
 */
public class TestListOnLimitAndHasName {
    /**
     * Метод вызывает метод getLimitListPokemon с разными лимитами
     * и далее проверяет что длина пришедшего списка соответствует лимиту с которым он вызывался
     * Далее у каждого элемента проверяется что поле не name не пустое или равно "null"
     */
    @Test
    public void checkLimitAndHasNameTest() {
        PokemonLimitModel listTenPokemons = PokemonRequests.getLimitListPokemon(10);
        PokemonLimitModel listNinePokemons = PokemonRequests.getLimitListPokemon(9);
        ArrayList<Pokemon> pokemons = listNinePokemons.getResults();
        boolean isHaveLimit = listTenPokemons.getResults().size() == 10 && pokemons.size() == 9;
        Assertions.assertTrue(isHaveLimit, "Пришёл не лимитированный список");
        boolean allPokemonsHaveName = true;

        for (Pokemon pokemon : pokemons) {
            String name = pokemon.getName().trim();
            if (name.equals("") || name.equals("null")) {
                allPokemonsHaveName = false;
                break;
            }
        }
        Assertions.assertTrue(allPokemonsHaveName, "Не у всех покемонов есть имя");
    }
}
