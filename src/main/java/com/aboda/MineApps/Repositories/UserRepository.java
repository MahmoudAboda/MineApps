package com.aboda.MineApps.Repositories;

import com.aboda.MineApps.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findUserByUserName(String userName);
    User findUserByEmail(String email);
}
