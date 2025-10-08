package com.secureon.iam.domain.services;

import com.backend.hormonalcare.iam.domain.model.commands.SeedRolesCommand;

public interface RoleCommandService {
    void handle(SeedRolesCommand command);
}
