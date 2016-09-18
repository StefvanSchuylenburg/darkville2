package me.darkville.web.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

/**
 * A Controller for displaying the games.
 */
@Controller
class GameController {

    /**
     * Shows an overview of the given game.
     */
    @RequestMapping("/games/{id}")
    fun gameOverview(): ModelAndView = ModelAndView("game")
}
