package com.stark.service.developerportfolio.controller;


import com.stark.service.developerportfolio.model.firestore.ProfileData;
import com.stark.service.developerportfolio.model.request.UserDataRequest;
import com.stark.service.developerportfolio.service.ProfileCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class CreateController {

    @Autowired
    ProfileCreateService profileCreateService;

    @PostMapping("/create-profile")
    public ProfileData createProfile(@RequestBody UserDataRequest userDataRequest) {
        return profileCreateService.create(userDataRequest.getEmailId());
    }
}
