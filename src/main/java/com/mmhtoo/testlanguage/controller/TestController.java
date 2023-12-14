package com.mmhtoo.testlanguage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
  
  @GetMapping( value = "/test" )
  public String testMapping(){
    return "Hello World From Spring Boot";
  }

}
