package com.stark.service.developerportfolio.service;

import com.stark.service.developerportfolio.model.Github;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GithubFetchService implements FetchService<Github> {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Github fetch(String userName) {
        // user name validations
        Github mock = restTemplate.getForObject("https://api.github.com/users/himanshuMaheshwari2311", Github.class);
        return mock;
    }
}
