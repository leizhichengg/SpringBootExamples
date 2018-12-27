package com.springboot.dao;

import com.springboot.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/12/27 0027 16:48
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long> {

    SysUser findByUsername(String username);
}
