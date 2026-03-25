package com.neshab.FreshMart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AppController {


    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Welcome to home-page";
    }

    @RequestMapping("/homepage")
    public String homePage() {
        return "home-page.html";
    }



    @GetMapping("/welcome")
    @ResponseBody
    public String welcomeMessage() {
        return "<html><body><h1>Welcome to FreshMart!</h1>"
                + "<form action='/status' method='get'>"
                + "<button type='submit'>Check Status</button>"
                + "</form></body></html>";
    }

    @GetMapping("/status")
    @ResponseBody
    public String appStatus()
    {
        return "FreshMart application is running smoothly!";
    }


    @GetMapping("/chat")
    @ResponseBody
    public String getChatResponse() {
        ResponseGenerator generator = new ResponseGenerator();
        return generator.generateResponse();  // now returns a String
    }

}
