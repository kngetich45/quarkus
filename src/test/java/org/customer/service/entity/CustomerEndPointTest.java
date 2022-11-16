package org.customer.service.entity;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Path;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.*;

@Path("customers")
@QuarkusTest
class CustomerEndPointTest {
/*
    JsonObject obj = Json.createObjectBuilder()
            .add("name","John")
            .add("surname","Benard").build();

    @Test
    void getAll() {
        given()
                .when()
                .get("/customers")
                .then()
                .statusCode(200)
                .body(containsString(""),
                        containsString(""));
    }

    @Test
    void findById() {
    }

    @Test
    void create() {
        given().contentType("application/json")
                .body(obj.toString())
                .when()
                .post("/customers")
                .then()
                .statusCode(201);
    }

    @Test
    void update() {
        obj = Json.createObjectBuilder()
                .add("id",0)
                .add("name","Toms")
                .add("surname","chris").build();

        given().contentType("application/json")
                .body(obj.toString())
                .when()
                .put("/customers")
                .then()
                .statusCode(204);
    }

    @Test
    void delete() {
        given().contentType("application/json")
                .body(obj.toString())
                .when()
                .delete("/customers?id=0")
                .then()
                .statusCode(204);
    }*/
}