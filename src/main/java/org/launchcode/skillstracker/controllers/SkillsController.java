package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String homepageContent(){
        return "<html>" +
                    "<body>" +
                        "<h1>Skill Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ul>" +
                            "<li>Java</li>" +
                            "<li>Ruby</li>" +
                            "<li>Python</li>" +
                        "</ul>" +
                        "<a href='/form'>Click here!</a>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String createUserForm(){
        return "<html>" +
                    "<body>" +
                        "<form action='hello' method='POST'>" +
                            "<h2>Name:</h2>" +
                            "<input type='text' name='name'/>" +
                            "<table>" +
                                "<tr>" +
                                    "<th>My favorite programming language</th>" +
                                    "<th>My Second favorite programming language</th>" +
                                    "<th>My Least favorite programming language</th>" +
                                "</tr>" +
                                "<tr>" +
                                    "<td>" +
                                        "<select name='skillOne'>" +
                                            "<option value='java'>Java</option>" +
                                            "<option value='ruby'>Ruby</option>" +
                                            "<option value='python'>Python</option>" +
                                        "</select>" +
                                    "</td>" +
                                    "<td>" +
                                        "<select name='skillTwo'>" +
                                            "<option value='java'>Java</option>" +
                                            "<option value='ruby'>Ruby</option>" +
                                            "<option value='python'>Python</option>" +
                                        "</select>" +
                                    "</td>" +
                                    "<td>" +
                                        "<select name='skillTwo'>" +
                                        "<option value='java'>Java</option>" +
                                        "<option value='ruby'>Ruby</option>" +
                                        "<option value='python'>Python</option>" +
                                        "</select>" +
                                    "</td>" +
                                "</tr>" +
                            "</table>" +
                            "<br>" +
                            "<br>" +
                            "<input type='submit' value='Submit'/>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }


    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value={"hello"})
    public String userSelectionResults(@RequestParam String name, @RequestParam String skillOne, @RequestParam String skillTwo, @RequestParam String skillThree ){
        return "<html>" +
                    "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<ul>" +
                            "<li>" + skillOne + "</li>" +
                            "<li>" + skillTwo + "</li>" +
                            "<li>" + skillThree + "</li>" +
                        "</ul>" +
                    "</body>" +
                "</html>";
    }
}
