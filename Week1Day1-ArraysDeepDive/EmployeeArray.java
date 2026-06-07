public class EmployeeArray{

    public static void main(String[] args){

        // step 1 Create array of employee IDs
        int[] employeeIDs={101,102,103,104,105};

        //step 2 print all employees
        System.out.println("employee IDs:");

        for(int id:employeeIDs){
            System.out.println(id);
        }

        //Step 3 & 4 Find highest and lowest employeeID
        int highestID=employeeIDs[0];
        int lowestID=employeeIDs[0];

        int sum=0;

        for(int id:employeeIDs){
            if(id>highestID){
                highestID=id;
            }
            if(id<lowestID){
                lowestID=id;
            }
            sum+=id;
            }
            //Step 5 Calculate Average employeeID
            double average=(double)sum/employeeIDs.length;

            //Step 6 Search employeeID 104
            int searchID=104;
            boolean found=false;
            for(int id:employeeIDs){
                if(id==searchID){
                    found=true;
                    break;
                }
            }
            //display results
            System.out.println("Highest Employee ID:"+highestID);
            System.out.println("Lowest Employee ID:"+lowestID);
            System.out.println("Average EMployee ID:"+average);
            if(found){
                System.out.println("Employee Found:");
            }
            else{
                System.out.println("Employee Not found:");

            }
            }

        }
    