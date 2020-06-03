package com.stark.service.developerportfolio.controller;

import com.stark.service.developerportfolio.model.request.UserDataRequest;
import com.stark.service.developerportfolio.service.ProfileDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class DeleteController {

    @Autowired
    ProfileDeleteService profileDeleteService;

    @PostMapping("/delete-profile")
    public String deleteProfile(@RequestBody UserDataRequest userDataRequest) {
        return profileDeleteService.delete(userDataRequest.getEmailId()) ? "Delete Successful" : "Delete Failed";
    }

}
