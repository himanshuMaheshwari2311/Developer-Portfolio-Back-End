package com.stark.service.developerportfolio.controller;

import com.stark.service.developerportfolio.model.firestore.ProfileData;
import com.stark.service.developerportfolio.model.request.UserDataRequest;
import com.stark.service.developerportfolio.service.ProfileFetchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class FetchController {

    @Autowired
    private ProfileFetchService profileFetchService;


    @GetMapping("/get-profile")
    public ProfileData getProfile(@RequestBody UserDataRequest userDataRequest) {
        return profileFetchService.fetch(userDataRequest.getEmailId());
    }
}
