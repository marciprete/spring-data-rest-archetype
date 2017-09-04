package ${groupId}.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(name = "/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "index";
    }

}
