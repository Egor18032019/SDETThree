package tests;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import models.PokemonModels;
import org.junit.jupiter.api.Test;

public class FirstTestCase {
    @Test
    public void postmanFirstGetTest() {
        String response = RestAssured.given()
                .baseUri("https://pokeapi.co/api/v2/")
                .contentType(ContentType.JSON)
                .when()
                .get("/pokemon/pidgeotto")
                .then()
                .statusCode(200)
                .extract().asString();

//        System.out.println(response);
        PokemonModels pokemonModels = new Gson().fromJson(response, PokemonModels.class);
        System.out.println(pokemonModels.getWeight());
        System.out.println();
        String nameSkill = pokemonModels.getAbilities().get(0).getAbility().getName();
        System.out.println(nameSkill);
    }
}

