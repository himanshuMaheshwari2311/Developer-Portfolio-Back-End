package com.stark.service.developerportfolio.controller;


import com.stark.service.developerportfolio.model.firebase.UserData;
import com.stark.service.developerportfolio.model.firebase.UserProfileData;
import com.stark.service.developerportfolio.model.github.Repository;
import com.stark.service.developerportfolio.service.FetchService;
import com.stark.service.developerportfolio.service.firebase.DataService;
import com.stark.service.developerportfolio.service.UserFetchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/user/fetch")
public class FetchController {

    @Autowired
    FetchService<List<Repository>> githubService;

    @Autowired
    DataService dataService;

    @Autowired
    UserFetchService userFetchService;

    @PostMapping("/getUserData")
    public UserProfileData getUserData(@RequestBody String emailId) {
        return userFetchService.fetch(emailId);
    }
}
