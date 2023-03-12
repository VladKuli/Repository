package org.store.web_ui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.store.core.requests.DeleteItemRequest;
import org.store.core.responses.DeleteItemResponse;
import org.store.core.services.DeleteItemService;

@Controller
public class DeleteItemController {

    @Autowired
    private DeleteItemService service;

    @GetMapping(value = "/deleteItem")
    public String showDeletePage(ModelMap map) {
        map.addAttribute("request", new DeleteItemRequest());
        return "deleteItem";
    }

    @PostMapping("/deleteItem")
    public String processDeleteItem(@ModelAttribute(value = "request") DeleteItemRequest request,
                                    ModelMap map) {
        DeleteItemResponse response = service.execute(request);
        if (response.hasErrors()) {
            map.addAttribute("errors", response.getErrors());
            return "deleteItem";
        } else {
            //TODO need to write success page
         return "deleteItem";
        }
    }
}