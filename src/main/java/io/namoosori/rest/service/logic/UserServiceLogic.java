package io.namoosori.rest.service.logic;

import io.namoosori.rest.entity.User;
import io.namoosori.rest.service.IUserService;
import io.namoosori.rest.store.IUserStore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceLogic implements IUserService {

    private final IUserStore userStore;

//    public UserServiceLogic(IUserStore userStore){
//        this.userStore = userStore;
//    }


    @Override
    public String regist(User newUser) {
        return this.userStore.create(newUser);
    }

    @Override
    public void modify(User newUse) {
        this.userStore.update(newUse);
    }

    @Override
    public void remove(String id) {
        this.userStore.delete(id);
    }

    @Override
    public User find(String id) {
        return this.userStore.retrieve(id);
    }

    @Override
    public List<User> findAll() {
        return this.userStore.retrieveAll();
    }
}
