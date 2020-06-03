package com.stark.service.developerportfolio.service;

import com.stark.service.developerportfolio.model.firestore.FirestoreData;
import com.stark.service.developerportfolio.model.firestore.ProfileData;
import com.stark.service.developerportfolio.service.firebase.DataService;
import com.stark.service.developerportfolio.util.FirestoreCollectionConstants;
import com.stark.service.developerportfolio.util.GoogleTokenAuthenticationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileCreateService implements CreateService<ProfileData> {

    @Autowired
    private DataService dataService;

    @Override
    public ProfileData create(String emailId) {
        ProfileData profileData = null;
        if(dataService.create(FirestoreCollectionConstants.USERDATA, emailId, FirestoreData.of(GoogleTokenAuthenticationUtil.getprofileData()))) {
            profileData = GoogleTokenAuthenticationUtil.getprofileData();
        }
        return profileData;
    }
}
