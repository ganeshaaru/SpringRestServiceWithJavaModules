package com.service.data;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class DataServiceImpl implements  DataService{
    @Override
    public List<String> getData() {
        return Stream.of("Foo", "Bar").collect(Collectors.toList());
    }
}
