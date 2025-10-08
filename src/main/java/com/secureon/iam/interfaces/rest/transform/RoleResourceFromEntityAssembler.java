package com.secureon.iam.interfaces.rest.transform;

import com.secureon.iam.domain.model.entities.Role;
import com.secureon.iam.interfaces.rest.resources.RoleResource;

public class RoleResourceFromEntityAssembler {
    public static RoleResource toResourceFromEntity(Role entity) {
        return new RoleResource(entity.getId(), entity.getStringName());

    }
}
