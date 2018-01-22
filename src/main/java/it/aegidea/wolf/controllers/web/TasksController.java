package it.aegidea.wolf.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/tasks")
public class TasksController {

   @RequestMapping(method = RequestMethod.GET)
   public String getTasks() {
      return "tasks";
   }

}
