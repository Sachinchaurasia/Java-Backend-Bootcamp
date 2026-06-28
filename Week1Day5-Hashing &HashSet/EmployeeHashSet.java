import java.util.HashSet;


public class EmployeeHashSet {
    public static void main(String[] args){
        //Step 1-Create  HashSet obj
        HashSet<String> employees=new HashSet<>();

        //Step 2-Add Sachin rahul amit priya Neha Rahul Amit
        employees.add("Sachin");
        employees.add("Rahul");
        employees.add("Amit");
        employees.add("Priya");
        employees.add("Neha");
        employees.add("Rahul");
        employees.add("Amit");

        //Step 3- Print all employees
        System.out.println("Employees");
        for(String employee:employees){
            System.out.println(employee);

        }

        //Step 4-print total number of unique employees
        System.out.println(employees.size());

        //Step 5-check whether priya exists
        if(employees.contains("Priya")){
            System.out.println("Priya exists");
        }
        else{
            System.out.println("Priya does not exists");

        }

        //Step 6-Remove Amit
        employees.remove("Amit");

        //Step 7-print updated list
        for(String employee:employees){
            System.out.println(employee);

        }
    }
}
