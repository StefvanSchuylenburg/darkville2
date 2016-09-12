package me.darkville.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

/**
 * The controller managing the home page.
 */
@Controller
class HomeController {

    /**
     * The home page.
     */
    @RequestMapping("/")
    fun home(): ModelAndView = ModelAndView("home")
            .addObject("body", "Hello World!")
}
