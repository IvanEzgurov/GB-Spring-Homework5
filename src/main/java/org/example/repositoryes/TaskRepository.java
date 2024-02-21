package org.example.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.example.models.Task;
import org.example.models.TaskStatus;

import java.util.List;

/**
 * Репозиторий для работы с БД H2
 */

@Repository

public interface TaskRepository extends JpaRepository<Task, Long> {

    /**
     * Собственный метод получения списка задач по статусу
     *
     * @param status искомый статус
     * @return список задач
     */
    List<Task> findTasksByStatus(TaskStatus status);
}
