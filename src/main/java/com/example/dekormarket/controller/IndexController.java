package com.example.dekormarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    /*@RequestMapping(value="/login",method = RequestMethod.GET)
    @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView("login");
        mv.addObject("username","користувач");
        return mv;
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    @PostMapping("/login")
    public ModelAndView postLogin(@RequestParam String username,
                                  @RequestParam String password) {
        String page = "index";
        boolean loggedIn = "secretuser".equals(username) &&
                "secretpasswd".equals(password);
        if (loggedIn) {
            page = "login";
        }
        ModelAndView mv = new ModelAndView(page);
        mv.addObject("loggeIn", loggedIn);
        if (loggedIn) {
            mv.addObject("message", "Pryvit Korystuvach");
            mv.addObject("message1", "Vy Zaloginylys....");
        }
        return mv;
    }*/


    @GetMapping("/registe")
    public String register() {
        return "registry/htmlRegistry/index";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact/headCcontact/index";
    }

    @GetMapping("/head")
    public String head(){
        return "head/head/index";
    }
    @GetMapping("/basket")
    public  String basket(){
        return "basket/head/index";
    }
    @GetMapping("/pain")
    public String paint(){
        return "pain/head/index";
    }
    @GetMapping("/plaster")
    public String plaster(){
        return "plaster/head/index";
    }
    @GetMapping("/portfolio")
    public String portfolio(){
        return "portfolio/head/index";
    }


    @GetMapping("/{root}/{page}/index")
    public String getPageDeep(@PathVariable String root,
                              @PathVariable String page) {
        //WebMvcAutoConfiguration
        return root+"/"+page + "/index";
    }
}
