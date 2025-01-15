package com.example.api.controller;

import com.example.api.model.Item;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private List<Item> items = new ArrayList<>();

    @GetMapping
    public List<Item> getItems() {
        return items;
    }

    @PostMapping
    public String createItem(@RequestBody Item item) {
        items.add(item);
        return "Item '" + item.getName() + "' criado com sucesso!";
    }
}
