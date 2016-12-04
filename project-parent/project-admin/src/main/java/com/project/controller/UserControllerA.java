package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

/**
 * Created by lihengjie on 2016/12/4.
 */
@Controller
@RequestMapping("/admin/user")
public class UserControllerA {

    @RequestMapping("/login")
    public String login(HttpServletRequest request) {
        return "login";
    }

}
