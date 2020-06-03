package com.stark.service.developerportfolio.controller;

import com.stark.service.developerportfolio.model.firestore.ProfileData;
import com.stark.service.developerportfolio.model.request.UserDataRequest;
import com.stark.service.developerportfolio.service.ProfileFetchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class FetchController {

    @Autowired
    private ProfileFetchService profileFetchService;


    @GetMapping("/get-profile")
    public ProfileData getProfile(@RequestBody UserDataRequest userDataRequest) {
        return profileFetchService.fetch(userDataRequest.getEmailId());
    }
}
