package com.rest.springrestapi.controller;

/**
 * Create a Rest Controller to demonstrate the various HTTP Methods and respond hello messages to the User.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloRestController {

    /**
     * @Purpose : Warn the request mapping is done then all the statements  of sayHello gets executed
     * @return : String
     * http://localhost:8080/hello  o/p - hello from bridzelabz
     */
    @RequestMapping(value="/hello")
    public String sayHello(){
        return "Hello From BridgeLabz ";
    }

}
