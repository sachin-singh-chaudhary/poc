/**
 * 
 */
package com.poc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PocController {
	
   @RequestMapping("/")
   @ResponseBody
   String home() {
      return "Hello World!";
   }
}
