package spring.boot.core.domain;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/11/25 0025 0:24
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
