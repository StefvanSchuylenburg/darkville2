package me.darkville.web.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

/**
 * The Controller displaying the home page of Darkville
 */
@Controller
class HomeController {

    @RequestMapping("")
    fun home(): ModelAndView = ModelAndView("home")

}
