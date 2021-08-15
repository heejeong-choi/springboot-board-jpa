package com.example.board.controller;

import com.example.board.model.Todo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "/main")
public class MainController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/todo_get")
    public Todo main() {
        return new Todo(counter.incrementAndGet(), "going grocery");
    }

    @RequestMapping(value = "/todo_post", method = RequestMethod.POST)
    public Todo postMain(@RequestParam(value = "todoTitle") String todoTitle) {
        return new Todo(counter.incrementAndGet(), todoTitle);
    }
}
