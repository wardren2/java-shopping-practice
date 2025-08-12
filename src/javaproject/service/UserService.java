package javaproject.service;

import javaproject.domain.User;

public class UserService {
    // 리팩토링: 서비스 레이어 분리
    public User createUser(String id, String password, String name, String email){
        return new User(id, password, name, email);
    }
}
