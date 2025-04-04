package com.kodilla.basic.dependency_injection.homework;

public interface NotificationService {

    void success(String address);

    void fail(String address);
}