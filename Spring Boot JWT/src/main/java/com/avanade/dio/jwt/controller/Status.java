package com.avanade.dio.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Status {

        @RequestMapping ("/status")
        public String viewStatus() {
        return "online";
    }


}
