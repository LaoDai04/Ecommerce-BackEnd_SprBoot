package com.example.businessapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.businessapp.service.ItemInfoService;

@RestController
@RequestMapping("/items")
public class ItemController {
    private final ItemInfoService itemInfoService;

    public ItemController(ItemInfoService itemInfoService) {
        this.itemInfoService = itemInfoService;
    }

    @GetMapping("/info")
    public String getItemInfo(@RequestParam(defaultValue = "World") String item) {
        return itemInfoService.getItemInfo(item);
    }
}
