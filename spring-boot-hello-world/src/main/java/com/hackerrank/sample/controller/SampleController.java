package com.hackerrank.sample.controller;

import com.hackerrank.sample.dto.StringResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SampleController {

  @GetMapping("/defaultHello")
  public StringResponse defaultHello(@RequestParam(value = "message", required = false) String message) {

    String finalMessage = (message != null) ? "Hello " + message : "Hello World!";

    return StringResponse.builder().echo(finalMessage).build();
  }
}
