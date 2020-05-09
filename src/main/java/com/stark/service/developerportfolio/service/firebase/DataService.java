package com.stark.service.developerportfolio.service.firebase;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.stark.service.developerportfolio.model.firestore.UserProfileData;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class DataService {

    public boolean exists(String collectionId, String documentId) {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        try {
            System.out.println(dbFirestore.collection(collectionId).document(documentId).getId());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean create(String collectionId, String documentId, UserProfileData userProfileData) {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(collectionId).document(documentId).set(userProfileData);
        System.out.println("CollectionsApi" + collectionsApiFuture);
        return true;
    }

    public UserProfileData read(String collectionId, String documentId) {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection(collectionId).document(documentId);
        ApiFuture<DocumentSnapshot> future = documentReference.get();


        DocumentSnapshot document = null;
        try {
            document = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        UserProfileData user = null;

        if(document.exists()) {
            user = document.toObject(UserProfileData.class);
            return user;
        }else {
            return null;
        }
    }

    public String update(String collectionId, String documentId, Object data) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(collectionId).document(documentId).set(data);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public String delete(String collectionId, String documentId) {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> writeResult = dbFirestore.collection(collectionId).document(documentId).delete();
        System.out.println("WriteResult: " + writeResult);
        return "Document with ID " + documentId + " has been deleted";
    }
}
