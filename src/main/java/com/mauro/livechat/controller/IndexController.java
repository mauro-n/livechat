package com.mauro.livechat.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/")
    public ResponseEntity<Void> gotoRoom(HttpServletResponse response) {
        response.addHeader("HX-Redirect", "/rooms/123");
        response.addHeader("HX-Reswap", "none");
        return ResponseEntity.ok().build();

    }
}
