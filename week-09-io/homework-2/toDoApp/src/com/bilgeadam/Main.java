package com.bilgeadam;

import com.bilgeadam.controller.TaskController;
import com.bilgeadam.model.dto.TaskDTO;
import com.bilgeadam.model.entity.Task;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

       /* TaskDTO taskDTO = new TaskDTO(UUID.randomUUID().toString(),"","",new Date(System.currentTimeMillis()));
        taskDTO.setA(10);
        taskDTO.setB(11);

        Task task = new Task(UUID.randomUUID().toString(),"","",new Date(System.currentTimeMillis()),false,false);
        task.setSum(taskDTO.getA()+ taskDTO.getB());*/


        TaskController taskController = new TaskController();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("ToDo Uygulaması");
            System.out.println("1.Görüntüleme\n2.Ekleme\n3.Düzenleme\n4.Silme\n5.Uygulamadan Çıkış");
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            int selection = scanner.nextInt();
            scanner.nextLine();
            switch (selection){
                case 1:
                    taskController.read();
                    break;
                case 2:
                    taskController.create();
                    break;
                case 3:
                    taskController.update();
                    break;
                case 4:
                    taskController.delete();
                    break;
                case 5:
                    taskController.exit();
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız.");
            }
        }
    }
}
