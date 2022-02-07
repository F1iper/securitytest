package com.securitytest.auth;

import java.util.Optional;

interface ApplicationUserDAO {

    Optional<ApplicationUser> selectApplicationUserByUsername(String username);
}
