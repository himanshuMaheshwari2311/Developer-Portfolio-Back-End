package com.stark.service.developerportfolio.model.firestore;

public class FirestoreData<T> {
    private T firestoreData;

    private FirestoreData(){}

    public static <T>  FirestoreData<T> of(T firestoreData){
        return new FirestoreData<>(firestoreData);
    }

    private FirestoreData(T firestoreData) {
        this.firestoreData = firestoreData;
    }

    public T getFirestoreData() {
        return firestoreData;
    }

    public void setFirestoreData(T firestoreData) {
        this.firestoreData = firestoreData;
    }
}
