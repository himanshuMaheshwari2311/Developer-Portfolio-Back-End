package com.stark.service.developerportfolio.service.firebase;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.stark.service.developerportfolio.model.github.User;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class DataService {

    public String saveUserDetails(String emailId) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        User githubUser = new User();
        githubUser.setEmail(emailId);
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection("user-data").document(emailId).set(githubUser);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public User getUserDetails(String emailId) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection("user-data").document(emailId);
        ApiFuture<DocumentSnapshot> future = documentReference.get();

        DocumentSnapshot document = future.get();

        User githubUser = null;

        if(document.exists()) {
            githubUser = document.toObject(User.class);
            return githubUser;
        }else {
            return null;
        }
    }

    public String updateUserDetails(User githubUser) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection("users").document(githubUser.getEmail()).set(githubUser);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public String deleteUser(String emailId) {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> writeResult = dbFirestore.collection("users").document(emailId).delete();
        return "Document with ID " + emailId + " has been deleted";
    }
}
