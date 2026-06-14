
public class EmployeeArraysOperations {

    public static void main(String[] args){

        //step 1-create employee array
        int[] employeeIds ={101,102,103,104,105};

        //Step 2-print all employee
        System.out.println("EmployeeID");
        for(int id:employeeIds){
            System.out.println(id);
        }

        //Step 3- Calculate total
        int total=0;
        for(int id:employeeIds){
            total+=id;
        }
        System.out.println("\n total employee ids="+total);

        //Step 4-Count employee
        System.out.println("EmployeeCount="+employeeIds.length);

        //Step 5 & 6 find highest and secondHighest
        int highest=Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;
        for(int id:employeeIds){
            if(id>highest){
                secondHighest=highest;
                highest=id;
            }
            else if
                (id>secondHighest){

                secondHighest=id;
            }
        }
        System.out.println("Highest employeeId="+highest);
        System.out.println("secondHighest EmployeeIds="+secondHighest);

        //Step 7- print reverse order
        for(int i=employeeIds.length-1;i>=0;i--){
            System.out.println(employeeIds[i]);

        }
        //Senior developer challenge
        int searchId=103;
        boolean found=false;

        for(int id:employeeIds){
            if(id==searchId)
            found=true;
            break;

        }

    
    if(found){
        System.out.println("\n Employee found");

    }
    else{
         System.out.println("\n Employee Not found");

    }
}
}

// AI Thinking Task

// Why would ArrayList be a better choice than Array in an Employee Management System where employees are added and removed frequently?

// ArrayList is better because it has a dynamic size, while arrays have a fixed size. In an employee management system, employees may join or leave frequently, making it difficult to manage fixed-size arrays. ArrayList can automatically grow or shrink as needed. This reduces maintenance effort and makes the application more scalable. It is also easier to add, remove, and manage employee records efficiently.
