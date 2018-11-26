package spring.boot.core.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/11/24 0024 20:07
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
