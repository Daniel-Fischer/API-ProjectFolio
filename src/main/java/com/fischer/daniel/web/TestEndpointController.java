package com.fischer.daniel.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
@RestController
public class TestEndpointController {

  @RequestMapping(path = "/greeting", method = RequestMethod.GET)
  public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
    return name + "greeting";
  }

}
