package com.secureon.iam.domain.model.commands;

import com.secureon.iam.domain.model.entities.Role;

import java.util.List;

public record SignUpCommand(String username, String password, List<Role> roles) {
}
