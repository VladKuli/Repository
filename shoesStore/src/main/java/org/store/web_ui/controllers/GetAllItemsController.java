package org.store.web_ui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.store.core.requests.GetAllItemsRequest;
import org.store.core.responses.GetAllItemsResponse;
import org.store.core.services.GetAllItemsService;

@Controller
public class GetAllItemsController {

    @Autowired
    private GetAllItemsService service;

    @GetMapping(value = "/getAllItems")
    public String showAllItems(ModelMap map) {
        GetAllItemsResponse response = service.execute(new GetAllItemsRequest());
        map.addAttribute("users", response.getItems());
        return "/getAllItems";
    }
}