package com.stark.service.developerportfolio.service;

import com.stark.service.developerportfolio.model.firestore.MasterData;
import com.stark.service.developerportfolio.service.firebase.DataService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProfileFetchService implements FetchService<MasterData>{

    @Autowired
    private DataService dataService;

    @Override
    public MasterData fetch(String userName) {
        return getDataFromFireStore(userName);
    }

    private MasterData getDataFromFireStore(String userName) {
        // check if data exists in firestore
        buildData(userName);
        return null;
    }

    private MasterData buildData(String userName) {
        
        return null;
    }
}
