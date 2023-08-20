package com.belajar.belajarspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;

// restcontroller digunakan untuk restApi
@RestController
@Api(value = "Hello controller")
public class HelloController {

    // untuk parameter api biasanya ada 2 tipe yang sering digunakan
    // 1. path parameter 2. query parameter

    // CONTOH QUERY PARAMETER
    // getMapping digunakan sebagai path webserver kita contoh :
    // localhost:7080/hello
    // @GetMapping("/hello")
    // // @RequestParam digunakan sebagai parameter yang akan di gunakan pada path
    // web
    // // server contoh : // localhost:7080/hello?name=anto
    // public String hello(@RequestParam("name") String name) {
    // // diatas termasuk query parameter
    // // path parameter biasanya di tambahkan "/hello/{name}"
    // return "hello " + name + " welcome to spring";
    // }

    // CONTOH PATH PARAMETER
    @GetMapping("/hello/{name}")
    @Operation(description = "Sample hello world api")
    public String hello(@PathVariable("name") String name) {
        return "hello " + name + " selamat datang";
    }
}
