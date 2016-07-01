package com.ilyamur.topaz.basicspringmvcthymeleaf.controller;

import com.ilyamur.topaz.basicspringmvcthymeleaf.entity.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;

@Controller
public class UserController {

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String index(Model model) {

        // добавляем объект в модель, чтобы сослаться на нем в шаблоне
        model.addAttribute("users", Arrays.asList(
                new User(1, "Harry", 29),
                new User(2, "James", 27),
                new User(3, "Heather", 17),
                new User(4, "Henry", 32)));

        // имя шаблона, поиск шаблона выполняется по указанным префиксу и суффиксу в ThymeleafConfiguration
        return "users";
    }
}
