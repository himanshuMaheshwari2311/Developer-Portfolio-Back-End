package com.stark.service.developerportfolio.service;

import com.stark.service.developerportfolio.model.firestore.FirestoreData;
import com.stark.service.developerportfolio.model.firestore.UserProfileData;
import com.stark.service.developerportfolio.service.firebase.DataService;
import com.stark.service.developerportfolio.util.FirestoreCollectionConstants;
import com.stark.service.developerportfolio.util.GoogleTokenAuthenticationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFetchService implements FetchService<UserProfileData>{

    @Autowired
    private DataService dataService;

    @Override
    public UserProfileData fetch(String emailId) {
        UserProfileData userProfileData;

        userProfileData = (UserProfileData) dataService.read(FirestoreCollectionConstants.USERDATA, emailId).getFirestoreData();

        if(userProfileData == null) {
            if(dataService.create(FirestoreCollectionConstants.USERDATA, emailId, FirestoreData.of(GoogleTokenAuthenticationUtil.getUserProfileData()))) {
                userProfileData = GoogleTokenAuthenticationUtil.getUserProfileData();
                System.out.println(userProfileData);
                return userProfileData;
            }
        }

        return userProfileData;
    }
}
