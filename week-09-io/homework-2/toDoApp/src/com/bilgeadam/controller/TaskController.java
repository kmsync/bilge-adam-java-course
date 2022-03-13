package com.bilgeadam.controller;

import com.bilgeadam.model.dto.TaskDTO;
import com.bilgeadam.model.entity.Task;
import com.bilgeadam.service.TaskService;
import com.bilgeadam.util.DateConvertUtil;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TaskController {

    private final Scanner scanner = new Scanner(System.in);

    private final TaskService taskService = new TaskService();

    public void create(){
        TaskDTO taskDTO = new TaskDTO();
        System.out.println("Oluşturmak istediğiniz task ile ilgili bilgileri giriniz:");
        System.out.print("Title: ");
        taskDTO.setTitle(scanner.nextLine());
        System.out.print("Description: ");
        taskDTO.setDescription(scanner.nextLine());
        System.out.print("dueDate giriniz(Format: GG/AA/YYYY) :");
        taskDTO.setDueDate(DateConvertUtil.stringConvertToDate(scanner.nextLine()));
        System.out.print("Parola bilgisiniz giriniz:");
        taskDTO.setDueDate(DateConvertUtil.stringConvertToDate(scanner.nextLine()));
        this.taskService.create(taskDTO);
    }

    /**
     * id title description dueDate isCompleted
     *
     *
     */
    public void read(){
        String separator = "****************************************";
        System.out.println(separator);
        System.out.println("id           title         description         dueDate       isCompleted");
        for(Task task : this.taskService.read()){
            System.out.println(task.getId()+ "     " + task.getTitle() + "     " + task.getDescription() + "     " + task.getDueDate() + task.isCompleted());
        }
        System.out.println(separator);
    }

    public void update(){
        TaskDTO taskDTO = new TaskDTO();
        System.out.print("Düzenlemek istediğiniz taskın id'sini giriniz: ");
        taskDTO.setId(scanner.nextLine());

        System.out.println("Düzenlemek istediğiniz"+ taskDTO.getId() +"idli task ile ilgili bilgileri giriniz:");
        System.out.print("Title: ");
        taskDTO.setTitle(scanner.nextLine());
        System.out.print("Description: ");
        taskDTO.setDescription(scanner.nextLine());
        System.out.print("dueDate giriniz(Format: GG/AA/YYYY) :");
        taskDTO.setDueDate(DateConvertUtil.stringConvertToDate(scanner.nextLine()));
        System.out.println("Task tamamlandı mı? (Evet/Hayır)");
        boolean isCompleted = false;
        String isCompletedString = scanner.nextLine();
        if( isCompletedString.toLowerCase(Locale.ENGLISH).equals("evet")){
            isCompleted = true;
        }
        taskDTO.setCompleted(isCompleted);
        this.taskService.update(taskDTO);

    }

    public void delete(){
        System.out.print("Düzenlemek istediğiniz taskın id'sini giriniz: ");
        this.taskService.delete(scanner.nextLine());
    }

    public void exit() {
        this.taskService.exit();
        System.exit(0);

    }
}
