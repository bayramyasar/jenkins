package com.dyippay.dofjenkins.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ServiceController {

    @GetMapping(value = { "/", "/index"})
    public String indexMain() {

        return "Selam";
    }

    @GetMapping("/greetingServiceController")
    public String greetingNoParam() {

        log.info("greeting..");
        String returnValue = null;

        returnValue = "OK";

        return returnValue;
    }

}
