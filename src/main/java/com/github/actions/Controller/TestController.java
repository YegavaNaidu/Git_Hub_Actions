
package com.github.actions.Controller;

import org.springframework.web.bind.annotation.RestController;
@RestController("/githubactions")
public class TestController {


@GetMapping("/test1")
public String test1(){
  return "my first deployment in azure VM through github Actions done successfully";
}


}
