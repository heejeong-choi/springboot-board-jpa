package com.example.board.config;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

public class RequestConfig {

    private ClientHttpRequestFactory getRestConfigHttpRequestFactory() {
        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();

        clientHttpRequestFactory.setConnectionRequestTimeout(5000);
        clientHttpRequestFactory.setReadTimeout(5000);
        return clientHttpRequestFactory;
    }
}
