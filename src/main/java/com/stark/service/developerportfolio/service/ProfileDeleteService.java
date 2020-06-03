package com.stark.service.developerportfolio.service;

import com.stark.service.developerportfolio.service.firebase.DataService;
import com.stark.service.developerportfolio.util.FirestoreCollectionConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class ProfileDeleteService implements DeleteService {

    @Autowired
    DataService dataService;

    @Override
    public boolean delete(String emailId) {
        try {
            dataService.delete(FirestoreCollectionConstants.USERDATA, emailId);
        } catch (ExecutionException e) {
            e.printStackTrace();
            return false;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
