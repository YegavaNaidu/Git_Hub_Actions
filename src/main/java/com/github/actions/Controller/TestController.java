
  package com.github.actions.Controller;

  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.springframework.web.bind.annotation.RequestMapping;
  @RestController()
  @RequestMapping("/api")
  public class TestController {


  @GetMapping("/test1")
  public String test1(){
    return "my first deployment in azure VM through github Actions done successfully";
  }


  }
