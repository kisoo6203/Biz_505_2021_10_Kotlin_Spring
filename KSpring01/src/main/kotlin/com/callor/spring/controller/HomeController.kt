package com.callor.spring.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HomeController {

    @ResponseBody
    @RequestMapping(value=["/"],method=[RequestMethod.GET])
    fun home():String {

        return "방가방가"
    }

    @RequestMapping(value=["/hello"],method=[RequestMethod.GET])
    fun hello(model:Model) :String {

        model.addAttribute("name" , "홍길동이")
        return "hello"
    }
}