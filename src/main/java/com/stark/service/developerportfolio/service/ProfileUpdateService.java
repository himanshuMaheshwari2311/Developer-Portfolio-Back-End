package com.stark.service.developerportfolio.service;

import com.stark.service.developerportfolio.model.firestore.FirestoreData;
import com.stark.service.developerportfolio.model.firestore.ProfileData;
import com.stark.service.developerportfolio.service.firebase.DataService;
import com.stark.service.developerportfolio.util.FirestoreCollectionConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class ProfileUpdateService implements UpdateService<ProfileData> {

    @Autowired
    DataService dataService;

    @Override
    public boolean update(ProfileData profileData) {
        try {
            dataService.update(FirestoreCollectionConstants.USERDATA, profileData.getEmailId(), FirestoreData.of(profileData));
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        } catch (ExecutionException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
