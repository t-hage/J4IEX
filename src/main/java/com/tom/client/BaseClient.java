package com.tom.client;

import com.tom.model.CompanyInformationDto;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BaseClient {

    protected static String TARGET = "https://api.iextrading.com/1.0";

    protected static Client client = ClientBuilder.newClient();

    protected <T> T get(String path, Class<T> type) {
        return get(path, new HashMap<>(), type);
    }

    protected <T> T get(String path, Map<String, String> queryParams, Class<T> type) {

        Response response = withQueryParams(client.target(TARGET).path(path), queryParams)
                .request(MediaType.APPLICATION_JSON).get();

        System.out.println(response.getStatus());
        return response.readEntity(type);
    }



    protected <T> ArrayList<T> getList(String path) {
        return getList(path, new HashMap<>());
    }

    protected <T> ArrayList<T> getList(String path, Map<String, String> queryParams) {
        GenericType<ArrayList<T>> t = new GenericType<ArrayList<T>>(){};

        Response response = withQueryParams(client.target(TARGET).path(path), queryParams)
                .request(MediaType.APPLICATION_JSON).get();

        System.out.println(response.getStatus());
        return (response.readEntity(t));
    }

    private WebTarget withQueryParams(WebTarget target, Map<String, String> queryParams) {

        for(Map.Entry<String, String> query : queryParams.entrySet()){
            target = target.queryParam(query.getKey(), query.getValue());
        }
        return target;
    }

}
