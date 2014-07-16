package com.hashedin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hashedin.model.Ratings;


@Controller
public class RatingsController
{

    @RequestMapping(method = RequestMethod.GET, value = "/ratings")
    public ModelAndView getView(@ModelAttribute("ratings") Ratings rating)
    {

        return new ModelAndView("addRatings");
    }


    @RequestMapping(method = RequestMethod.POST, value = "/ratings")
    public ModelAndView add(Model model, @ModelAttribute("ratings") Ratings rating)
    {
        return new ModelAndView("ratingAdded", "rating", rating);
    }
}
