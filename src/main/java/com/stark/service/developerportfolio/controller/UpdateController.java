package com.stark.service.developerportfolio.controller;

import com.stark.service.developerportfolio.model.firestore.ProfileData;
import com.stark.service.developerportfolio.service.ProfileUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class UpdateController {

    @Autowired
    ProfileUpdateService profileUpdateService;


    @PostMapping("/update-profile")
    public String updateProfile(@RequestBody ProfileData profileData) {
        return profileUpdateService.update(profileData) ? "Updated Profile" : "Profile Update Failed";
    }

}
