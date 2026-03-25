package com.neshab.FreshMart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppController {


    @RequestMapping("/")
    public String home() {
        return "home-page.html";
    }
    @RequestMapping("/homepage")
    public String homePage() {
        return "home-page.html";
    }



    @GetMapping("/welcome")
    public String welcomeMessage() {
        return "<html><body><h1>Welcome to FreshMart!</h1>"
                + "<form action='/status' method='get'>"
                + "<button type='submit'>Check Status</button>"
                + "</form></body></html>";
    }

    @GetMapping("/status")
    public String appStatus()
    {
        return "FreshMart application is running smoothly!";
    }


    @GetMapping("/chat")
    public String getChatResponse() {
        ResponseGenerator generator = new ResponseGenerator();
        return generator.generateResponse();  // now returns a String
    }

}
