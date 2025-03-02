package com.query.projeto_query.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.stereotype.Service;

@Service
public class BankService {
    private final HttpClient httpClient = HttpClient.newHttpClient();

    public String buscarBancos() throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://brasilapi.com.br/api/banks/v1"))
        .GET()
        .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
