/**
 * 
 */
package com.sci.servicehub.repository;

import org.springframework.data.repository.CrudRepository;

import com.sci.servicehub.model.User;

/**
 * @author abdiel Jaramillo
 *
 */
public interface UserRepository extends CrudRepository<User, Long>
{

    User findByUserName(String userName);

}
