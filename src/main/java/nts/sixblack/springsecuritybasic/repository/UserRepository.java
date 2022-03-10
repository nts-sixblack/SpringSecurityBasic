package nts.sixblack.springsecuritybasic.repository;

import nts.sixblack.springsecuritybasic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserName(String userName);
}