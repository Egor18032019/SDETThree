package requests;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import models.PokemonLimitModel;
import models.PokemonPropertyModel;
import org.apache.http.HttpStatus;
import utils.Const;

/**
 * Класс для выполнения запроса
 */
public class PokemonRequests {

    /**
     * Метод осуществляет запрос по url
     * получат JSON
     * и возвращает модель покемона с необходимыми свойствами
     *
     * @param namePokemon имя покемона чьи свойства нужны
     * @return
     */
    public static PokemonPropertyModel getAbilitiesPokemon(String namePokemon) {
        String responsePokemon = RestAssured.given()
                .baseUri(Const.baseUrl)
                .contentType(ContentType.JSON)
                .when()
                .get(Const.pokemon + namePokemon)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract().asString();
        return new Gson().fromJson(responsePokemon, PokemonPropertyModel.class);
    }

    public static PokemonLimitModel getLimitListPokemon(int limit) {
        String responsePokemons = RestAssured.given()
                .baseUri(Const.baseUrl)
                .contentType(ContentType.JSON)
                .when()
                .get(Const.pokemon + "?limit=" + limit)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract().asString();
        return new Gson().fromJson(responsePokemons, PokemonLimitModel.class);    }
}
