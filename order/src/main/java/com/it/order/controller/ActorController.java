package com.it.order.controller;

import com.it.order.entity.Actor;
import com.it.order.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actor")
public class ActorController {
    @Autowired
    ActorService actorService;

    @GetMapping("/")
    public Actor getActorById(Short id) {
        return actorService.getActorById(id);
    }
}
