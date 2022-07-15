package com.clientv1.amnclientv1.modles.client.common;

import com.clientv1.amnclientv1.modles.client.common.Exception.ObjectNotFound;
import com.clientv1.amnclientv1.security.jwt.JwtUtils;
import com.clientv1.amnclientv1.security.model.User;
import com.clientv1.amnclientv1.security.repository.UserRepository;

public class UserUtil {

    private final JwtUtils jwtUtils;
    private final UserRepository userRepository;

    public UserUtil(JwtUtils jwtUtils, UserRepository userRepository) {
        this.jwtUtils = jwtUtils;
        this.userRepository = userRepository;
    }

    public int getUserIdFromToken(String token) {

        String username = jwtUtils.getUserNameFromJwtToken(token.substring(7));

        if (!userRepository.existsByUsername(username)) {
            throw new ObjectNotFound("Error : user not found");
        }

        return ((User) userRepository.findByUsername(username).orElseThrow(() -> new ObjectNotFound("Error : user not found"))).getId().intValue();
    }
}
