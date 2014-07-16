package com.hashedin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hashedin.model.Ratings;
import com.hashedin.service.RatingsService;

@Controller
public class RatingsControllerJPA {

    @Autowired
    RatingsService ratingsService;

    @RequestMapping(method=RequestMethod.GET, value = "/ratings/persistence")
    public ModelAndView getView(@ModelAttribute("ratings") Ratings rating) {
        return new ModelAndView("addRating");
    }
    
    @RequestMapping(method=RequestMethod.POST, value = "/ratings/persistence")
    public ModelAndView add(Model model, @ModelAttribute("ratings") Ratings rating) {
        rating = ratingsService.save(rating);
        return new ModelAndView("ratingAddedWithId", "ratings", rating);
    }
}
