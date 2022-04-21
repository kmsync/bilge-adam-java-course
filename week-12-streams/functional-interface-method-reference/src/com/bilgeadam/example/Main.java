package com.bilgeadam.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Burak", "GÜL"));
        personList.add(new Person("Burak", "Duman"));
        personList.add(new Person("Ahmet", "Ağılkaya"));
        personList.add(new Person("Alp", "Durmaz"));

        List<Manager> managerList2 = personList
                .stream()
                .map(objectMapper::personMapToManager)
                .collect(Collectors.toList());

        Consumer<String> consumer = (a) -> System.out.println(a);

        Consumer<String> consumer2 = Main::printString;

        consumer2.accept("Method Reference İle Yazdır.");

        consumer.accept("Burak");

        Supplier<String> showString = () -> "Show String 1";
        System.out.println(showString.get());
        Supplier<String> showString2 = Main::showString;
        showString2.get();

        Predicate<List<Person>> findBurakThenReturnTrue = (x) -> {
            for(int i = 0 ; i < x.size() ; i++){
                if(x.get(i).getName().equals("Burak")){
                    return true;
                }
            }
            return false;
        };

        findBurakThenReturnTrue.test(personList);

        Predicate<List<Person>> findBurakThenReturnTrue2 = Main::findBurakThenReturnTrue;

        findBurakThenReturnTrue2.test(personList);


        //Person listesi employee listesine çevrildi.
        List<Employee> employeeList = map(personList,objectMapper::personMapToEmployee);
        List<Person> mappedPerson = map(employeeList,objectMapper::employeeMapToPerson);
        List<Manager> managerList = map(personList,objectMapper::personMapToManager);
        List<Manager> managerList1 = map(personList,objectMapper);
        List<Employee> employees = mapPersonToEmployee(personList,objectMapper);
    }

    public static boolean findBurakThenReturnTrue(List<Person> personList){
        for(int i = 0 ; i < personList.size() ; i++){
            if(personList.get(i).getName().equals("Burak")){
                return true;
            }
        }
        return false;
    }

    public static String showString(){
        return "showString2";
    }

    public static <T> void printString(T t){
        System.out.println(t);
    }

    public static <T,R> List<R> map(List<T> baseObject, Function<T,R> mapperFunction){
        List<R> mappedList = new ArrayList<>();
        for(int i = 0 ; i < baseObject.size() ; i++){
            //Person objesini Employee Objesine Çevirdik.
            mappedList.add(mapperFunction.apply(baseObject.get(i)));
        }
        return mappedList;
    }

    public static List<Manager> map(List<Person> baseObject, ObjectMapper objectMapper){
        List<Manager> mappedList = new ArrayList<>();
        for(int i = 0 ; i < baseObject.size() ; i++){
            //Person objesini Employee Objesine Çevirdik.
            mappedList.add(objectMapper.personMapToManager(baseObject.get(i)));
        }
        return mappedList;
    }

    public static List<Employee> mapPersonToEmployee(List<Person> baseObject, ObjectMapper objectMapper){
        List<Employee> mappedList = new ArrayList<>();
        for(int i = 0 ; i < baseObject.size() ; i++){
            //Person objesini Employee Objesine Çevirdik.
            mappedList.add(objectMapper.personMapToEmployee(baseObject.get(i)));
        }
        return mappedList;
    }
}
