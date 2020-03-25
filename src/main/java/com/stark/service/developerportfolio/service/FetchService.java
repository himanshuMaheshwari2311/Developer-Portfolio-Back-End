package com.stark.service.developerportfolio.service;

public interface FetchService<T> {
    T fetch(String userName);
}
