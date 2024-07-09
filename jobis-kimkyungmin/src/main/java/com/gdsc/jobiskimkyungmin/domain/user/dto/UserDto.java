package com.gdsc.jobiskimkyungmin.domain.user.dto;

import com.gdsc.jobiskimkyungmin.domain.user.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDto {

    private String username;
    private String password;
}
