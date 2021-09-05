package com.cbrf.final_version.web;

import com.cbrf.final_version.model.ValCurs;
import com.cbrf.final_version.model.Valute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@RestController
public class AppController {
    private String URL = "http://www.cbr.ru/scripts/XML_daily.asp?date_req=02/03/2021";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/")
    public String get(HttpServletRequest request) {

        return restTemplate.getForObject(URL, String.class);
    }



    @GetMapping("all")
    public ResponseEntity<List<ValCurs>> getAll() {
        ValCurs[] valsArray = restTemplate.getForObject(URL, ValCurs[].class);
        return new ResponseEntity<>(Arrays.asList(valsArray), HttpStatus.OK);

    }
}
