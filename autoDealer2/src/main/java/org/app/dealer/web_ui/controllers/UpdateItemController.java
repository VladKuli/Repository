package org.app.dealer.web_ui.controllers;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.store.core.requests.UpdateItemRequest;
import org.store.core.responses.UpdateItemResponse;
import org.store.core.services.UpdateItemService;

@Controller
public class UpdateItemController {


    @Autowired
    private UpdateItemService service;
    @GetMapping(value = "/updateItem")
    public String showUpdatingPage(ModelMap map) {
        map.addAttribute("request", new UpdateItemRequest());
        return "updateItem";
    }

    @PostMapping("/updateItem")
    public String processUpdate(@ModelAttribute("request") UpdateItemRequest request,
                                ModelMap map) {
        UpdateItemResponse response = service.execute(request);
        if (response.hasErrors()) {
            map.addAttribute("errors", response.getErrors());
            return "updateItem";
        } else {
            //TODO need to write success page
            return "updateItem";
        }
    }
}

 */