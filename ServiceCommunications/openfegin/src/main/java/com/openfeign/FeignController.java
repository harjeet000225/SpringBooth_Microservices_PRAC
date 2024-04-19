package com.openfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private HelloServiceFeignClient helloServiceFeignClient;

    @GetMapping("/greet")
    public ResponseEntity<String> hello(){
        String helloResponse = helloServiceFeignClient.hello().getBody();
        return ResponseEntity.status(200).body(helloResponse);
    }


}
