package com.lmtAPI.lmt.Repository;

import com.lmtAPI.lmt.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(@Param("email") String email);
    User findByUserIdFirebase(@Param("userIdFirebase") String userIdFirebase);
}
