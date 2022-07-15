package com.clientv1.amnclientv1.security.payLoad.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class JwtResponse {

    private String accessToken;
    private String type = "Bearer";
    private String refreshToken;
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private List<String> roles;

    public JwtResponse(String accessToken, String type, String refreshToken, Long id, String username, String firstName, String lastName, String email, List<String> roles) {
        this.accessToken = accessToken;
        this.type = type;
        this.refreshToken = refreshToken;
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.roles = roles;
    }
}
