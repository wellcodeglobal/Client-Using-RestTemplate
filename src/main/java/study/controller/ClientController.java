package study.controller;

import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import study.model.JSONPropertyClass;

import java.util.Collections;

@Controller
public class ClientController {

    private RestTemplate restTemplate;
    private HttpHeaders headers;
    private final String url = "http://api.ipinfodb.com/v3/ip-city/?key=bf7b4c18ef7f3626f0e1b4076ea5b1d1ca7b249dd18c7e11aa7398b812e5b40e&ip=118.136.87.221&format=json";

    public ClientController()
    {
        this.restTemplate = new RestTemplate();
        this.headers = new HttpHeaders();
    }

    public void printJson()
    {
        this.headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<String>(this.headers);

        ResponseEntity<JSONPropertyClass> responseEntity = this.restTemplate.exchange(this.url, HttpMethod.GET, entity, JSONPropertyClass.class);

        if(responseEntity.getStatusCode() == HttpStatus.OK)
        {
            JSONPropertyClass jsonPropertyClass = responseEntity.getBody();
            System.out.println(jsonPropertyClass.getRegion());
            System.out.println(jsonPropertyClass.getCountryName());
            System.out.println(jsonPropertyClass.getCity());
        }
        else
        {
            System.out.println("Error");
        }
    }
}
