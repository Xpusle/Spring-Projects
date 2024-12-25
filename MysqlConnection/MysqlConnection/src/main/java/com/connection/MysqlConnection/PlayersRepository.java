package com.connection.MysqlConnection;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository

public interface PlayersRepository extends JpaRepository<Players,String>{
	List<Players> findBygoalsscored(Integer goalsscored);
}
