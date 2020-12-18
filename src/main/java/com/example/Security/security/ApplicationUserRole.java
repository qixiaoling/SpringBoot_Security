package com.example.Security.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.example.Security.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(
            STUDENT_READ,
            COURSE_WRITE,
            STUDENT_READ,
            STUDENT_WRITE)),
    ADMINTRAINEE(Sets.newHashSet(
            STUDENT_READ,
            COURSE_READ));



    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions){
        this.permissions= permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
