package com.stark.service.developerportfolio.service.firebase;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.stark.service.developerportfolio.model.github.User;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class DataService {

    public String saveUserDetails() throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        User githubUser = new User();
        githubUser.setEmail("xyz@dbc.com");
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection("user-data").document("himanshu.maheshwari@db.com").set(githubUser);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }
}
