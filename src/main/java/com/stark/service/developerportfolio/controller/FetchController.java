package com.stark.service.developerportfolio.controller;


import com.stark.service.developerportfolio.model.firestore.UserProfileData;
import com.stark.service.developerportfolio.model.request.UserDataRequest;
import com.stark.service.developerportfolio.service.UserFetchService;
import com.stark.service.developerportfolio.service.firebase.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/fetch")
public class FetchController {

    @Autowired
    private UserFetchService userFetchService;

    @PostMapping("/user-data")
    public UserProfileData getUserData(@RequestBody UserDataRequest userDataRequest, @RequestHeader (name="Authorization") String token) {
        System.out.println(token);
        return userFetchService.fetch(userDataRequest.getEmailId());
    }
}
