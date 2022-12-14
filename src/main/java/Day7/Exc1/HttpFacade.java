package Day7.Exc1;

import com.google.gson.Gson;
import org.apache.hc.client5.http.classic.methods.*;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpHeaders;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class HttpFacade {


//    public static Response get(String url) throws IOException {
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
//            try {
//
//                HttpGet request = new HttpGet("https://httpbin.org/get");
//
//                // add request headers
//                request.addHeader("custom-key", "mkyong");
//                request.addHeader(HttpHeaders.USER_AGENT, "Googlebot");
//
//                CloseableHttpResponse response = httpClient.execute(request);
//
//                try {
//
//                    // Get HttpResponse Status
//                    System.out.println(response.getVersion());              // HTTP/1.1
//                    System.out.println(response.getCode() + " " + response.getReasonPhrase());   // 200
//
//                    HttpEntity entity = response.getEntity();
//                    if (entity != null) {
//                        // return it as a String
//                        String result = EntityUtils.toString(entity);
//                        System.out.println(result);
//                    }
//
//                } catch (ParseException e) {
//                    throw new RuntimeException(e);
//
//                }
//            } finally {
//
//            }
//        }
//    }

    public static Response get(String url) {

        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(url);

            try (CloseableHttpResponse response = httpclient.execute(httpGet)) {
                HttpEntity entity = response.getEntity();
                String json = EntityUtils.toString(entity);

                Gson gson = new Gson();
                Map<String, Object> map = gson.fromJson(json, Map.class); // deserializes json into map

                EntityUtils.consume(entity);

                return new Response(response.getCode(), map);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static Response post(String url, List<NameValuePair> nvps) {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {

            HttpPost httpPost = new HttpPost(url);
            httpPost.setEntity(new UrlEncodedFormEntity(nvps));
            httpPost.setEntity(new UrlEncodedFormEntity(nvps, StandardCharsets.UTF_8));

            try (CloseableHttpResponse response = httpclient.execute(httpPost)) {
                HttpEntity entity = response.getEntity();
                String json = EntityUtils.toString(entity);

                Gson gson = new Gson();
                Map<String, Object> map = gson.fromJson(json, Map.class); // deserializes json into map

                EntityUtils.consume(entity);

                return new Response(response.getCode(), map);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Response put(String url, List<NameValuePair> nvps) {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {

            HttpPut httpPut = new HttpPut(url);
            httpPut.setEntity(new UrlEncodedFormEntity(nvps));
            httpPut.setEntity(new UrlEncodedFormEntity(nvps, StandardCharsets.UTF_8));

            try (CloseableHttpResponse response = httpclient.execute(httpPut)) {
                HttpEntity entity = response.getEntity();
                String json = EntityUtils.toString(entity);

                Gson gson = new Gson();
                Map<String, Object> map = gson.fromJson(json, Map.class); // deserializes json into map

                EntityUtils.consume(entity);

                return new Response(response.getCode(), map);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Response patch(String url, List<NameValuePair> nvps) {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {

            HttpPatch httpPatch = new HttpPatch(url);
            httpPatch.setEntity(new UrlEncodedFormEntity(nvps));
            httpPatch.setEntity(new UrlEncodedFormEntity(nvps, StandardCharsets.UTF_8));

            try (CloseableHttpResponse response = httpclient.execute(httpPatch)) {
                HttpEntity entity = response.getEntity();
                String json = EntityUtils.toString(entity);

                Gson gson = new Gson();
                Map<String, Object> map = gson.fromJson(json, Map.class); // deserializes json into map

                EntityUtils.consume(entity);

                return new Response(response.getCode(), map);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Response delete(String url) {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpDelete httpDelete = new HttpDelete(url);

            try (CloseableHttpResponse response = httpclient.execute(httpDelete)) {
                return new Response(response.getCode(), null);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



