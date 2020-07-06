package com.inje.vmware.vra.rest;

import org.apache.http.client.utils.URIBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.util.UriBuilder;

import java.util.Map;

public class RestFulParam {
    private URIBuilder uriBuilder;
    private HttpHeaders headers;
    private Map<String, Object> bodyMap;

    public RestFulParam(URIBuilder uriBuilder, HttpHeaders headers, Map<String, Object> bodyMap) {
        this.uriBuilder = uriBuilder;
        this.headers = headers;
        this.bodyMap = bodyMap;
    }

    public HttpEntity<Map<String, Object>> getEntity() {
        return  new HttpEntity<>(bodyMap, headers);
    }

    public URIBuilder getUriBuilder() {
        return uriBuilder;
    }

    public HttpHeaders getHeaders() {
        return headers;
    }

    public Map<String, Object> getBodyMap() {
        return bodyMap;
    }

    public HttpEntity<Map<String, Object>> createHttpEntity() {
        HttpEntity<Map<String, Object>> httpEntity = new HttpEntity<>(bodyMap, headers);
        return httpEntity;
    }
}