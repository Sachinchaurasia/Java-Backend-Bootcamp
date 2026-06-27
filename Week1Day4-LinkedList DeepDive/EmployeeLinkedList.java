import java.util.LinkedList;

public class EmployeeLinkedList{

    public static void main(String[] args){

        //Step 1:Create LikedList
        LinkedList<String> employees=new LinkedList<>();

        //Step 2:Add employees
        employees.add("Sachin");
        employees.add("Rahul");
        employees.add("Amit");
        employees.add("Priya");
        employees.add("Neha");

        //Step 3: Print all employees
        System.out.println("Employees");
        for(String employee:employees){
            System.out.println(employee);
        }

        //Step 4 : Add Manager at the first using addFirst()
        employees.addFirst("Manager");

        //Step 5 :Add Intern at the end
        employees.addLast("Intern");

        //Step 6:Remove Amit
        employees.remove("Amit");

        //Step 7: Print first and Last employee
        System.out.println("first employee :"+employees.getFirst());
        System.out.println("Last employee :"+employees.getLast());

        //Step 8:Print final employeeList

        System.out.println("\n Final Employee List :");
        for(String employee:employees){
            System.out.println(employee);
            
        }
    }
}