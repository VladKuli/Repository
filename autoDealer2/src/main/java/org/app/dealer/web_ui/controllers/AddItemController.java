package org.app.dealer.web_ui.controllers;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.store.core.requests.AddItemRequest;
import org.store.core.responses.AddItemResponse;
import org.store.core.services.AddItemService;

@Controller
public class AddItemController {

    @Autowired
    private AddItemService service;

    @GetMapping(value = "/addItem")
    public String showAddItemPage(ModelMap map) {
        map.addAttribute("request", new AddItemRequest());
        return "addItem";
    }

    @PostMapping("/addItem")
    public String processAddItem(@ModelAttribute(value = "request") AddItemRequest request,
                                 ModelMap map) {
        AddItemResponse response = service.execute(request);
        if (response.hasErrors()) {
            map.addAttribute("errors", response.getErrors());
            return "addItem";
        } else {
            //TODO Need to write a page for success operation
            return "addItem";
        }
    }


}

 */