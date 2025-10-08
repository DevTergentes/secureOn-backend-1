package com.secureon.iam.domain.model.queries;

import com.secureon.iam.domain.model.valueobjects.Roles;

public record GetRoleByNameQuery(Roles name) {
}
