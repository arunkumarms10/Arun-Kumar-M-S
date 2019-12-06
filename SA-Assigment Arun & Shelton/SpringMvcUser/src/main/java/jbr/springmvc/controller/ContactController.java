package jbr.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jbr.springmvc.model.Counter;
import jbr.springmvc.service.ContactService;


@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;
    
    @RequestMapping(value = "/checkCounter")
    public String  counterSelection(HttpServletRequest request, HttpServletResponse response,
                                  @ModelAttribute("counter") Counter counter) {
                String a=request.getParameter("counter"); 
                   String message=contactService.findCounter(a);
        return message;
        
       
    }
}
