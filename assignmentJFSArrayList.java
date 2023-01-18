import java.util.ArrayList;
import java.util.Scanner;

//Anushka Srivastav 12002704
//Bugs:

//1.how to fix, it modifies one added to the index input 
//

public class assignmentJFSArrayList {
    public static void main(String[] args) {

        functionalities nt= new functionalities();
        Scanner input=new Scanner(System.in);

        nt.Menu();

        int Choice = input.nextInt();
        
        nt.selectChoice(Choice);
        System.out.println("Wanna keep using? Enter y/n");
        String y = "y";
        String s= input.nextLine();
        if(s.equals(y))
        {
            nt.Menu();
        }
        int c= input.nextInt();
        if(c==1)
        {
            nt.selectChoice(Choice);
        }
        }  
}

class functionalities {
    
    ArrayList<String> ToDoListEntry= new ArrayList<String>();
    Scanner input=new Scanner(System.in);

    public void NewTask(){
        
        String Entry =input.nextLine();
        ToDoListEntry.add(Entry);
        System.out.println("Successfully Added");
        System.out.println("Wanna enter more? Enter 1.");
        int a= input.nextInt();
        if(a==1)
        {
            input.nextLine();
            NewTask();
        }
        returnToMenu();
    }

    public void PrintTask(){
        System.out.println(ToDoListEntry);
        returnToMenu();
    }

    public void ViewTask(){
        System.out.println("Enter a index to view task");
        input.nextLine();
        int n= input.nextInt();
        System.out.println(ToDoListEntry.get(n));
        returnToMenu();
    }

    public void DeleteTask(){
        System.out.println("Enter task index to delete");
        int i= input.nextInt();
        System.out.println("Warning this Task will be deleted forvever!!");
        System.out.println("Enter y to confirm");
        String y = "y";
        input.nextLine();
        String s= input.nextLine();
        if(s.equals(y))
        {
            ToDoListEntry.remove(i);
        }
        System.out.println("Item Successfully Removed");
        System.out.println("This is your updated ToDo List.");
        System.out.println(ToDoListEntry);
        returnToMenu();

    }

    public void ModifyTask(){
        System.out.println("Enter index of Task you wanna modify");
        int idx= input.nextInt();
        System.out.println("Enter the updated Task");
        input.nextLine();
        String s= input.nextLine();
        ToDoListEntry.set(idx, s );
        System.out.println("Task Updated Successfully");
        returnToMenu();
    }
    
    public void Menu(){
        System.out.println("Enter a number associated with the Task you want to perform\n");
        System.out.println("Enter 1 to add a New Task\n Enter 2 to List all available Tasks \n Press 3 to select and View any of the available To DO Tasks \n Press 4 to Delete a TO do Task \n Press 5 to Replace or Update a Task");
        
    }

    public void returnToMenu(){
        System.out.println(" Enter 0 to return to Main Menu");
        int a= input.nextInt();
        if(a==0)
        {
            Menu();
            a= input.nextInt();
            selectChoice(a);
        }
        else
        System.out.println("Wrong input, Enter Again");
        returnToMenu();
    }
    public void selectChoice(int x){
        
        switch(x){  
            //Case statements  
            case 1: { 
                System.out.println("Enter your task now");
                NewTask();
            } 
            break;    
            case 2: {PrintTask();};
            break; 
            case 3: {ViewTask();};  
            break;
            case 4: {DeleteTask();};  
            break;  
            case 5: {ModifyTask();};
            //Default case statement  
            default:{returnToMenu();
                    };
        }
    
    }
}






