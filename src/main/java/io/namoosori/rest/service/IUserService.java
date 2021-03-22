package io.namoosori.rest.service;

import io.namoosori.rest.entity.User;

import java.util.List;

public interface IUserService {
    String regist(User newUser);
    void modify(User newUse);
    void remove(String id);

    User find(String id);
    List<User> findAll();
}
