package com.stark.service.developerportfolio.controller;


import com.stark.service.developerportfolio.model.github.Repository;
import com.stark.service.developerportfolio.model.github.User;
import com.stark.service.developerportfolio.service.FetchService;
import com.stark.service.developerportfolio.service.firebase.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/v1/user/fetch")
public class FetchController {

    @Autowired
    FetchService<List<Repository>> githubService;

    @Autowired
    DataService dataService;

    @PostMapping("/github")
    public List<Repository> fetchUserGithubData(@RequestBody String userName) {
        return githubService.fetch(userName);
    }

    @PostMapping("/firebase")
    public String testFirebaseDataService() throws ExecutionException, InterruptedException {
        return dataService.saveUserDetails("m.himanshu2311@gmail.com");
    }
}
