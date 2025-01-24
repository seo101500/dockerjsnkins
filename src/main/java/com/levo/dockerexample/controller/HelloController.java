package com.levo.dockerexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("docker-java-app")
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/html")
    public String index() {
        return """
                <html>
                  <head>
                    <title>Docker Java App</title>
                    <style>
                      body {
                        font-family: Arial, sans-serif;
                        text-align: center;
                        margin-top: 50px;
                      }
                      h1 {
                        color: #28a745;
                      }
                      p {
                        font-size: 18px;
                        color: #555;
                      }
                    </style>
                  </head>
                  <body>
                    <h1>젠킨스 파이프라인 성공!</h1>
                    <p>Docker Java 애플리케이션이 정상적으로 실행되고 있습니다.</p>
                  </body>
                </html>
               """;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "docker-java-app is up and running!";
    }
}

