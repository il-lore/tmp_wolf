package it.aegidea.wolf.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.awt.event.KeyEvent;

@Controller
public class HomepageController {

   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String getHomepage() {
      return "homepage";
   }

}
