package com.mtpinterface.util;

import java.io.IOException;
import java.text.ParseException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpclientUtil {

    private CloseableHttpResponse closeableHttpResponse;

    public String post(String url, String json) throws ClientProtocolException, IOException{

        CloseableHttpClient httpclient = HttpClients.createDefault();

        HttpPost post = new HttpPost(url);

        //数据提交格式

        //post.setHeader("content-type", "application/x-www-form-urlencoded;charset=UTF-8");
        post.setHeader("content-type", "application/json;charset=UTF-8");

        StringEntity entity = new StringEntity(json, "UTF-8");

        post.setEntity(entity);

        CloseableHttpResponse response = httpclient.execute(post);

        closeableHttpResponse = response;
        //获取响应内容

        String entityFlow = EntityUtils.toString(response.getEntity());

        response.close();

        httpclient.close();

        return entityFlow;

    }

    public CloseableHttpResponse getCloseableHttpResponse() {
        return closeableHttpResponse;
    }

    public String get(String url) throws ParseException, IOException{

        CloseableHttpClient httpclient = HttpClients.createDefault();

        HttpGet get = new HttpGet(url);

        get.setHeader("content-type", "application/json;charset=UTF-8");

        CloseableHttpResponse response = httpclient.execute(get);

        //获取响应内容

        String entityFlow = EntityUtils.toString(response.getEntity());

        response.close();

        httpclient.close();

        return entityFlow;

    }


    public String put(String url) throws ParseException, IOException{

        CloseableHttpClient httpclient = HttpClients.createDefault();

        HttpPut put= new HttpPut(url);

        put.setHeader("content-type", "application/json;charset=UTF-8");

        CloseableHttpResponse response = httpclient.execute(put);

        //获取响应内容

        String entityFlow = EntityUtils.toString(response.getEntity());

        response.close();

        httpclient.close();

        return entityFlow;

    }

}
