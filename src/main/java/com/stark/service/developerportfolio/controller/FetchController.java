package com.stark.service.developerportfolio.controller;


import com.stark.service.developerportfolio.model.Github;
import com.stark.service.developerportfolio.service.FetchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user/fetch")
public class FetchController {

    @Autowired
    FetchService<Github> githubService;

    @PostMapping("/github")
    public Github fetchUserGithubData(@RequestBody String userName) {
        return githubService.fetch(userName);
    }


}
