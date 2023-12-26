package com.gabrielcazzeri.todosimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gabrielcazzeri.todosimple.models.Task;
import java.util.List;


@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByUser_Id(Long id);

/*
    *** COMO FAZER A QUERY COM JPQL ***
    @Query(value = "SELECT t FROM Task t WHERE t.user.id = :id")
    List<Task> xyz(@Param("id") Long id);

    *** COMO FAZER A QUERY CO MSQL PURO ***
    @Query(value = "SELECT * FROM task t WHERE t.user_id = :id", nativeQuery = true)
    List<Task> findByUser_Id(@Param("id") Long id);
*/

    
}
