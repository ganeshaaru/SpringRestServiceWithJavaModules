package com.web.rest;

import com.service.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestService {

    @Autowired
    private DataService dataService;

    @GetMapping(path = "/data")
    public List<String> getData(){
        return dataService.getData();
    }
}
