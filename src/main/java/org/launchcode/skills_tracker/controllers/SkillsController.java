package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    // localhost:8080/
    @ResponseBody
    @GetMapping("/")
    public String skillsTrackerIntro(){
        String htmlReturn = "<html> " +
                "<body>" +
                "<h1>" + "Skills Tracker" +
                "</h1>" +
                "<h2>" + "We have a few skills we would like to learn. Here is the list!" +
                "</h2>" +
                "<ol>" +
                "<li>" + "Java" + "</li>" +
                "<li>" + "JavaScript" + "</li>" +
                "<li>" + "Python" + "</li>" +
                "</ol>" +
                "</body>" +
                "<html>";
        return htmlReturn;
    }

    // localhost:8080/form
    @GetMapping("/form")
    @ResponseBody
    public String displayForm(){
        String htmlForm = "<html> " +
                "<body>" +
                "<form action='/user-response' method='POST'>" +
                "<label for='Name:'> Enter Name: </label>"  + "<br>" +
                "<input type='text' name='name'/>"  + "<br>" +
                "<label for = 'My favorite language:'> My favorite language:</label>"   + "<br>" +
                "<select name = 'lang1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +  "<br>" +
                "<label for = 'My second favorite language:'> My Second favorite language:</label>"  + "<br>" +
                "<select name = 'lang2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" + "<br>" +
                "<label for = 'My third favorite language:'> My Third favorite language:</label>"  + "<br>" +
                "<select name = 'lang3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" + "<br>" +
                "<input type='submit' value='Submit'>" + "<br>" +
                "</form>" +
                "</body>" +
                "<html>";

        return htmlForm;
    }

    // localhost:8080/user-response
    @ResponseBody
    @PostMapping("/user-response")
    //@RequestMapping(value="/user-response", method = RequestMethod.POST)
    public String skillsTrackerIntro(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3){
        String htmlUserResponse =
                "<html> " +
                        "<body>" +
                        "<h1>" + "Skills Tracker" +
                        "</h1>" +
                        "<h2>" + name + "</h2>" +
                        "<table border=" + "1>" +
                        "<ol>" +
                            "<tr>" +
                                "<td>" +
                                    "<ol>" +
                                        "<li>" + lang1 + "</li>" +
                                        "<li>" + lang2 + "</li>" +
                                        "<li>" + lang3 + "</li>" +
                                    "</ol>" +
                                 "</td>" +
                            "</tr>" +
                        "</ol>" +
                        "</table>" +
                        "</body>" +
                        "<html>";

        return htmlUserResponse;
    }



}
