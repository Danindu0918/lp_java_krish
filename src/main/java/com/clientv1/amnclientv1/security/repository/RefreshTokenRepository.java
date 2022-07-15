package com.clientv1.amnclientv1.security.repository;

import com.clientv1.amnclientv1.security.model.RefreshToken;
import com.clientv1.amnclientv1.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

    Optional<RefreshToken> findByToken(String token);

    @Modifying
    int deleteByUser(User user);
}
