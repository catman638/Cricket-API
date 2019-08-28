package com.arjunkumar.cricketapi.controllers;


import com.arjunkumar.cricketapi.models.Match;
import com.arjunkumar.cricketapi.models.Ranks;
import com.arjunkumar.cricketapi.services.OneDayMatchServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/oneday")
public class OneDayMatchController {

    @Autowired
    OneDayMatchServiceInterface oneDayMatchService;

    @RequestMapping("/team/rankings")
    public List<Ranks> getCurrentOnedayTeamRankings() {
        return oneDayMatchService.getCurrentOnedayTeamRankings();
    }
}
