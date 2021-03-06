package acceptance.security;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import acceptance.AbstractAccTest;
import pro.taskana.TaskService;
import pro.taskana.TaskSummary;
import pro.taskana.security.JAASExtension;
import pro.taskana.security.WithAccessId;

/**
 * Acceptance test for task queries and authorization.
 */
@ExtendWith(JAASExtension.class)
class TaskQueryAccTest extends AbstractAccTest {

    TaskQueryAccTest() {
        super();
    }

    @Test
    void testTaskQueryUnauthenticated() {
        TaskService taskService = taskanaEngine.getTaskService();

        List<TaskSummary> results = taskService.createTaskQuery()
            .ownerLike("%a%", "%u%")
            .list();

        assertThat(results.size(), equalTo(0));

    }

    @WithAccessId(
        userName = "user_1_1") // , groupNames = {"businessadmin"})
    @Test
    void testTaskQueryUser_1_1() {
        TaskService taskService = taskanaEngine.getTaskService();

        List<TaskSummary> results = taskService.createTaskQuery()
            .ownerLike("%a%", "%u%")
            .list();

        assertThat(results.size(), equalTo(3));

    }

    @WithAccessId(
        userName = "user_1_1", groupNames = {"businessadmin"})
    @Test
    void testTaskQueryUser_1_1BusinessAdm() {
        TaskService taskService = taskanaEngine.getTaskService();

        List<TaskSummary> results = taskService.createTaskQuery()
            .ownerLike("%a%", "%u%")
            .list();

        assertThat(results.size(), equalTo(3));

    }

    @WithAccessId(
        userName = "user_1_1", groupNames = {"admin"})
    @Test
    void testTaskQueryUser_1_1Admin() {
        TaskService taskService = taskanaEngine.getTaskService();

        List<TaskSummary> results = taskService.createTaskQuery()
            .ownerLike("%a%", "%u%")
            .list();

        assertThat(results.size(), equalTo(25));

    }

}
