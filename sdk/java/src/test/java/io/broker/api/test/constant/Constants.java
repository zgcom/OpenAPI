package io.broker.api.test.constant;

public class Constants {

    // FIXME: change to a valid key and secret for test
    public final static String ACCESS_KEY = "";
    public final static String SECRET_KEY = "";
    public static final String BASE_DOMAIN = "";

    // REST api url format: https://api.BASE_DOMAIN
    public static final String API_BASE_URL = "https://api." + BASE_DOMAIN;

    // Websocket base api url format: wss://wsapi.BASE_DOMAIN/openapi/quote/ws/v1
    public static final String WS_API_BASE_URL =  "wss://wsapi." + BASE_DOMAIN +  "/openapi/quote/ws/v1";

    // Websocket user api url format: wss://wsapi.BASE_DOMAIN/openapi/ws
    public static final String WS_API_USER_URL = "wss://wsapi." + BASE_DOMAIN + "/openapi/ws";
}
