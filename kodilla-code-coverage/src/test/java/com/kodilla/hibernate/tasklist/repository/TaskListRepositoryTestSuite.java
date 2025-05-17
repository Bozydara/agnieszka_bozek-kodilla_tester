package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    private static final String LIST_NAME = "To do on Monday";
    private static final String DESCRIPTION = "Tasks to be done on Monday";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LIST_NAME, DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readListsNames = taskListRepository.findByListName(listName);

        //Then
        Assertions.assertEquals(LIST_NAME, readListsNames.get(0).getListName());
        Assertions.assertEquals(1, readListsNames.size());

        //CleanUp
        int id = readListsNames.get(0).getId();
        taskListRepository.deleteById(id);
    }
}