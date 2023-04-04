package requests;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import models.PokemonModel;

/**
 * Класс для выполнения запроса
 */
public class AbilitiesPokemonRequests {

    /**
     * Метод осуществляет запрос по url
     * получат JSON
     * и возвращает модель покемона с необходимыми свойствами
     *
     * @param namePokemon имя покемона чьи свойства нужны
     * @return
     */
    public static PokemonModel getAbilitiesPokemon(String namePokemon) {
        String responsePokemon = RestAssured.given()
                .baseUri("https://pokeapi.co/api/v2/")
                .contentType(ContentType.JSON)
                .when()
                .get("/pokemon/" + namePokemon)
                .then()
                .statusCode(200)
                .extract().asString();
        return new Gson().fromJson(responsePokemon, PokemonModel.class);
    }
}
