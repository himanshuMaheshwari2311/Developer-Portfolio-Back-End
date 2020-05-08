package com.stark.service.developerportfolio.service.firebase;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.stark.service.developerportfolio.model.firebase.UserProfileData;
import com.stark.service.developerportfolio.model.github.User;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class DataService {

    private final Firestore dbFirestore = FirestoreClient.getFirestore();

    public boolean create(String collectionId, String documentId, Object data) throws InterruptedException, ExecutionException {
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(collectionId).document(documentId).set(data);
        return true;
    }

    public UserProfileData read(String collectionId, String documentId) throws InterruptedException, ExecutionException {

        DocumentReference documentReference = dbFirestore.collection(collectionId).document(documentId);
        ApiFuture<DocumentSnapshot> future = documentReference.get();

        DocumentSnapshot document = future.get();

        UserProfileData user = null;

        if(document.exists()) {
            user = document.toObject(UserProfileData.class);
            return user;
        }else {
            return null;
        }
    }

    public String update(String collectionId, String documentId, Object data) throws InterruptedException, ExecutionException {
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(collectionId).document(documentId).set(data);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public String delete(String collectionId, String documentId) {
        ApiFuture<WriteResult> writeResult = dbFirestore.collection(collectionId).document(documentId).delete();
        return "Document with ID " + documentId + " has been deleted";
    }
}
