import java.util.ArrayList;
public class EmployeeArrayList {

    public static void main(String[] args) {
        
        // Step --1  Create ArrayList
        ArrayList<String> employees=new ArrayList<>();

        //Step 2-- add employees
        employees.add("Sachin");
        employees.add("Rahul");
        employees.add("Amit");
        employees.add("Priya");
        employees.add("Neha");

        //Step 3-- Print All employees
        System.out.println("Employee List");
        for(String employee:employees){
            System.out.println(employee);
        }
        //Step 4--Print total Employees
        System.out.println("\n Total empployees:"+employees.size());
        
        //Step 5-- Search Rahul
        if(employees.contains("Rahul")){
            System.out.println("Rahul Found");

        }
        else{
            System.out.println("Rahul not Found");

        }

        //Step 6-- Remove Amit
        employees.remove("Amit");

        //Step 7--Print updated Employee List
        System.out.println("\n Updated Employee List:");
        for(String employee:employees){
            System.out.println(employee);
            
        }
    }
}
