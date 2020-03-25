package com.stark.service.developerportfolio.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.stark.service.developerportfolio.model.github.Repository;
import com.stark.service.developerportfolio.model.github.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class GithubFetchService implements FetchService<List<Repository>> {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Repository> fetch(String userName) {
        // user name validations
        List<Repository> mock = Arrays.asList(restTemplate.getForObject("https://api.github.com/users/himanshuMaheshwari2311/repos", Repository[].class));
        return mock;
    }
}
