package com.mmhtoo.testlanguage.controller;

import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping( value = "/api" )
@AllArgsConstructor
public class TestRestController {

    private final MessageSource messageSource;

    @GetMapping( value = "/test" )
    public String testMapping(
            Locale locale
    ){
        return messageSource.getMessage("index.message",null,locale);
    }

}
