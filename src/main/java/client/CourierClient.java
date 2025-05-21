package client;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import client.Client;
import model.courier.Courier;
import model.courier.CourierWithoutLogin;
import model.courier.CourierWithoutPassword;
import model.courier.CourierForAuth;
import model.courier.CourierForAuthWithoutLogin;
import model.courier.CourierForAuthWithoutPassword;

public class CourierClient extends Client {
    private final static String ROOT = "/courier";
    private static final String LOGIN = "/login";

    @Step("Создание курьера")
    public Response create(Courier courier) {
        return spec()
                .body(courier)
                .when()
                .post(ROOT);
    }

    @Step("Создание курьера без поля password")
    public Response createWithoutPassword(CourierWithoutPassword courierWithoutPassword) {
        return spec()
                .body(courierWithoutPassword)
                .when()
                .post(ROOT);
    }

    @Step("Создание курьера без поля login")
    public Response createWithoutLogin(CourierWithoutLogin courierWithoutLogin) {
        return spec()
                .body(courierWithoutLogin)
                .when()
                .post(ROOT);
    }

    @Step("Авторизация курьера")
    public Response login(CourierForAuth courierForAuth) {
        return spec()
                .body(courierForAuth)
                .when()
                .post(ROOT + LOGIN);
    }

    @Step("Авторизация без поля login")
    public Response loginWithoutLogin(CourierForAuthWithoutLogin courierForAuthWithoutLogin) {
        return spec()
                .body(courierForAuthWithoutLogin)
                .when()
                .post(ROOT + LOGIN);
    }

    @Step("Авторизация без поля password")
    public Response loginWithoutPassword(CourierForAuthWithoutPassword courierForAuthWithoutPassword) {
        return spec()
                .body(courierForAuthWithoutPassword)
                .when()
                .post(ROOT + LOGIN);
    }

    @Step("Удаление курьера")
    public Response deleteCourier(Integer courierId) {
        return spec()
                .delete(ROOT + String.format("/%d", courierId));
    }
}
