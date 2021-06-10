package com.javasampleapproach.springrest.mysql.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.javasampleapproach.springrest.mysql.model.Customer;
import com.javasampleapproach.springrest.mysql.model.Tranings;

public interface TrainingsRepository extends CrudRepository<Tranings, Long> {
	@Query("Select t From Tranings t where t.status = :status and t.userid = :userid")
	List<Tranings> findByStatusAndUserId(@Param("status") int status,@Param("userid") int userid);
	
	/*@Query("Select c From Customer c where c.name = :name and c.age = :age")
	Customer findByNameAndAge(@Param("name") String name, @Param("age") Integer age);
	
	@Modifying
	@Transactional
	@Query("update Customer c set c.name = :name where c.age = :age")
	int updateUserSetNameForAge(@Param("name") String name, 
	  @Param("age") Integer age);
	  */
}
