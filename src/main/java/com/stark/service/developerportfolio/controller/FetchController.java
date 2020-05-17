package com.stark.service.developerportfolio.controller;


import com.stark.service.developerportfolio.model.firestore.UserProfileData;
import com.stark.service.developerportfolio.model.request.UserDataRequest;
import com.stark.service.developerportfolio.service.ProfileFetchService;
import com.stark.service.developerportfolio.service.UserFetchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/fetch")
public class FetchController {

    @Autowired
    private UserFetchService userFetchService;

    @Autowired
    private ProfileFetchService profileFetchService;

    @PostMapping("/user-data")
    public UserProfileData getUserData(@RequestBody UserDataRequest userDataRequest) {
        return userFetchService.fetch(userDataRequest.getEmailId());
    }

    @GetMapping("/build-profile")
    public void buildProfile(@RequestBody UserDataRequest userDataRequest) {
        profileFetchService.fetch(userDataRequest.getEmailId());
    }
}
