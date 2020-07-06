package com.inje.vmware.vra.rest;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URIBuilder;

import java.net.URISyntaxException;
import java.util.List;

public class URIBuilderUtils {
    public static final String VRA = "https://vra.bi.co.kr";

    public static URIBuilder createURIBuilder(String restURL, List<NameValuePair> basicNameValuePairList) throws URISyntaxException {
        URIBuilder uriBuilder = new URIBuilder(VRA + restURL);

        if(basicNameValuePairList != null)
            uriBuilder.addParameters(basicNameValuePairList);

        return uriBuilder;
    }

}
