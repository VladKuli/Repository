package org.store.web_ui.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(value = "/adminMenu")
    public String indexOfMain() {
        return "adminMenu";
    }
}