package com.rest.springrestapi.controller;

/**
 * Create a Rest Controller to demonstrate the various HTTP Methods and respond hello messages to the User.
 */

import com.rest.springrestapi.controller.entity.User;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloRestController {

    /**
     * @Purpose : Warn the request mapping is done then all the statements  of sayHello gets executed
     * @return : String
     * @CURL : http://localhost:8080/hello  o/p - hello from bridzelabz
     */
    @RequestMapping(value="/hello")
    public String sayHello(){
        return "Hello From BridgeLabz ";
    }

/**
 * @RequestParam : Mapping HTTP GET Request onto specific Handler Methods.
 * @O/P : When mapping is done all statements of  sayHello method get executed
 * @CURL :     //GET localhost:8080/getMessage?name=Suraj
 */
    @GetMapping(value="/getMessage")
    public String sayHello(@RequestParam(value = "name" )String name){
        return "Hello " + name + " Welcome To BridgeLabz";
    }
    /**@Purpose : Use GET Request Method and pass name as path variable
     * @param : name
     * @return: String
     * @CURL :localhost:8080/param/Suraj%20Chaudhary
     */
    @GetMapping(value= "/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello " + name + " Welcome To BridgeLabz";
    }
    /** @PostMapping : this annotation handle the post type of annotation
     *  @RequestBody : is used to convert the body of HTTP request to java class object
     *  @CURL : http://localhost:8080/post?Content-type=json : URL requests through POSTMAN
     *  @JSON:{
     *          "firstName":"Suraj",
     *          "lastName" :"Chaudhary"
     *      }
     * @O/P ; Hello Suraj Chaudhary Welcome To BridgeLabz
     */
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody User userInfo ){
        return "Hello " + userInfo.getFirstName() +" "+userInfo.getLastName() + " Welcome To BridgeLabz";

    }
}
