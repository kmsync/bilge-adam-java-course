package com.bilgeadam.service;

import com.bilgeadam.io.ErrorWriter;
import com.bilgeadam.io.TaskReader;
import com.bilgeadam.io.TaskWriter;
import com.bilgeadam.model.dto.TaskDTO;
import com.bilgeadam.model.entity.Task;
import com.bilgeadam.util.ModelMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private List<Task> tasks;

    public TaskService(){
        this.loadObject();
    }

    public void create(TaskDTO taskDTO){
        this.tasks.add(ModelMapper.createModelFromDto(taskDTO));
    }

    public List<Task> read(){
        List<Task> tasks = new ArrayList<>();
        for(Task task : this.tasks){
            if(!task.isDeleted()){
                tasks.add(task);
            }
        }
        return tasks;
    }

    public void update(TaskDTO taskDTO){
        for(Task task : this.tasks){
            if(taskDTO.getId().equals(task.getId())){
                ModelMapper.dtoMapToModel(taskDTO,task);
            }
        }
    }

    public void delete(String id){
        for(Task task : this.tasks){
            if(task.getId().equals(id)){
                task.setDeleted(true);
            }
        }

    }

    public void exit(){
        try (TaskWriter taskWriter = new TaskWriter()){
            taskWriter.writeObject(this.tasks);
        }catch (IOException ioException){
            try (ErrorWriter errorWriter = new ErrorWriter()){
                errorWriter.write(ioException);
            }catch (IOException ioException1){
                System.err.println(ioException1.getMessage()+ ioException.getMessage());
            }
        }
    }

    public void loadObject(){
        try (TaskReader taskReader = new TaskReader()){
            this.tasks = taskReader.readObject();
        }catch (IOException | ClassNotFoundException ioException){
            try (ErrorWriter errorWriter = new ErrorWriter()){
                errorWriter.write(ioException);
            }catch (IOException ioException1){
                System.err.println(ioException1.getMessage()+ ioException.getMessage());
            }
        }
        if(this.tasks == null) this.tasks = new ArrayList<>();
    }
}
