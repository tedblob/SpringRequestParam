package com.tedblob.spring.mvc.requestParam.controllers;

import com.tedblob.spring.mvc.requestParam.models.Feedback;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class MultipleParamsController {

    /*@RequestMapping(value = "/feedback", method = RequestMethod.POST)
    public String getUserFeedback(@RequestParam Map<String,String> requestParams) throws Exception{
        String email=requestParams.get("email");
        String username=requestParams.get("username");
        String feedback=requestParams.get("feedback");

        System.out.println("Email : " + email +
                "\n Username :" + username +
                "\n feedback : "+ feedback);
        // your code logic
        return "feedback";
    }*/
   /* @RequestMapping(value = "/feedback", method = RequestMethod.POST)
    public String getFeedback(@RequestParam("email") String email,
                              @RequestParam("username") String username,
                              @RequestParam("title") String title,
                              @RequestParam("feedback") String feedback) throws Exception{

        System.out.println("Email : " + email +
                "\n Username :" + username +
                "\n feedback : "+ feedback +
                "\n title : " + title);
        // your code logic
        return "feedback";
    }*/
    @RequestMapping(value = "/feedback", method = RequestMethod.POST)
    public String getFeedback(Feedback feedback) throws Exception{

        System.out.println("Email : " + feedback.getEmail() +
                "\n Username :" + feedback.getUsername() +
                "\n feedback : "+ feedback.getFeedback() +
                "\n title : " + feedback.getTitle());
        // your code logic
        return "feedback";
    }

    @GetMapping("/orderStatus")
    public String getOrderStatus(@RequestParam(name = "orderId", required = false, defaultValue = "999") Integer orderId) {
        System.out.println("Order orderId " + orderId);
        return "Order orderId: " + orderId;
    }
    @DeleteMapping("/deleteOrder/{orderId}")
    public ResponseEntity<Long> deleteOrder(@PathVariable(value = "id") Long orderId) {
        // Access the DB and delete the order
        return ResponseEntity.ok(orderId);
    }
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public String getUserList(@RequestParam("user") List<String> users) throws Exception{

        System.out.println("User List : " + users);
        // your code logic
        return "users";
    }

    @RequestMapping(value = "/feedbacksOfUsers", method = RequestMethod.POST)
    public String feedbacksOfUsers(@RequestParam MultiValueMap<String, String> requestParams) throws Exception{

        System.out.println("Multi Value Map : " + requestParams);
        // your code logic
        return "users";
    }
}
