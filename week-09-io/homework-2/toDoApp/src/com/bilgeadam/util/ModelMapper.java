package com.bilgeadam.util;

import com.bilgeadam.io.ErrorWriter;
import com.bilgeadam.io.LogWriter;
import com.bilgeadam.model.dto.TaskDTO;
import com.bilgeadam.model.entity.Task;

import java.io.IOException;
import java.util.UUID;

public class ModelMapper {

    public static TaskDTO modelMapToDTO(Task task) {
        return new TaskDTO(task.getId(), task.getTitle(), task.getDescription(), task.getDueDate());
    }

    public static void dtoMapToModel(TaskDTO taskDTO, Task task) {
        task.setCompleted(taskDTO.isCompleted());
        task.setDeleted(taskDTO.isDeleted());
        task.setDescription(taskDTO.getDescription());
        task.setDueDate(taskDTO.getDueDate());
        task.setTitle(taskDTO.getTitle());
        task.setId(taskDTO.getId());

        // Loglama
        try (LogWriter logWriter = new LogWriter()) {
            logWriter.write(task);
        } catch (IOException ioException) {
            try (ErrorWriter errorWriter = new ErrorWriter()) {
                errorWriter.write(ioException);
            } catch (IOException ioException1) {
                System.err.println(ioException.getMessage() + ioException1.getMessage());
            }
        }
    }

    public static Task createModelFromDto(TaskDTO taskDTO) {
        Task task = new Task(UUID.randomUUID().toString(), taskDTO.getTitle(),
                taskDTO.getDescription(), taskDTO.getDueDate(),
                taskDTO.isCompleted(), taskDTO.isDeleted());
        try (LogWriter logWriter = new LogWriter()) {
            logWriter.write(task);
        } catch (IOException ioException) {
            try (ErrorWriter errorWriter = new ErrorWriter()) {
                errorWriter.write(ioException);
            } catch (IOException ioException1) {
                System.err.println(ioException.getMessage() + ioException1.getMessage());
            }
        }
        return task;
    }
}
