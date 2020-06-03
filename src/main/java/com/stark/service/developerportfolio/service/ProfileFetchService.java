package com.stark.service.developerportfolio.service;

import com.stark.service.developerportfolio.model.firestore.ProfileData;
import com.stark.service.developerportfolio.service.firebase.DataService;
import com.stark.service.developerportfolio.util.FirestoreCollectionConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileFetchService implements FetchService<ProfileData>{

    @Autowired
    private DataService dataService;

    @Override
    public ProfileData fetch(String emailId) {
        return  (ProfileData) dataService.read(FirestoreCollectionConstants.USERDATA, emailId).getFirestoreData();
    }
}
