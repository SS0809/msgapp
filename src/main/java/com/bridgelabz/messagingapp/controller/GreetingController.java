package com.bridgelabz.messagingapp.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class GreetingController {
    JSONObject jsonObject = new JSONObject();
    GreetingController(){
        jsonObject.put("name","default_value");
    }
    //Get Mapping
    @GetMapping(value = "/hello",produces = "application/json")
    public String sayHello(){
        return jsonObject.toString();
    }
    //Post Mapping
    @PostMapping(value = "/hello",produces = "application/json")
    public String postHello(@RequestBody Map<String,Object> newData){
        jsonObject.put("name",newData.get("name"));
        return "hello for "+jsonObject.get("name")+ " from Post";
    }
    //Put Mapping
    @PutMapping(value = "/hello",produces = "application/json")
    public String putHello(@RequestBody Map<String,Object> newData){
        jsonObject.put("name",newData.get("name"));
        return "hello for "+ jsonObject.get("name") +" from Put";
    }
    //Delete Mapping
    @DeleteMapping(value = "/hello",produces = "application/json")
    public String deleteHello(@RequestBody Map<String,Object> newData){
        return "hello "+newData.remove("name")+" deleted";
    }
}
