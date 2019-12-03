package prodapt.javaProgram;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class StudentEntry{
   private int token;
   private String name;
   private double cgpa;
   public StudentEntry(int id, String name, double cgpa) {
      super(); //object construction
      this.token = id;
      this.name = name;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getName() {
      return name;
   }
   public double getCgpa() {
      return cgpa;
   }
   
   public int compareTo(StudentEntry s)
   {
       if(this.cgpa < s.cgpa){  
           return -1;
       }else if (this.cgpa > s.cgpa){
            return 1; 
       }
       if(this.name.compareTo(s.name) > 0){
           return -1;
       }else if(this.name.compareTo(s.name) < 0){
           return 1;
       }else{
            if(this.token < s.token){ 
               return -1;
            }
       }
       return 1;
   }
       
   public String toString()
   {
       return ""+ this.token +" " + this.name + " " + this.cgpa;
   }
}

public class PriorityQueue {

    public static ArrayList<StudentEntry> studentQueue = new ArrayList<>();
    
    public static void insertStudent(StudentEntry s)
    {
        int insertPos = 0;
        for(int i = 0;i < studentQueue.size() ;i++){
            if(studentQueue.get(insertPos).compareTo(s)>0){
                insertPos = i+1;
            }else{
                break;
            }
        }
        studentQueue.add(insertPos,s);
    }
    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the total number of events:");
      int totalEvents = in.nextInt();
      while(totalEvents>0){
    	 System.out.println("Enter the Entries : "+" ENTER Or Served");
        String[] eventArr = in.nextLine().split(" "); //string splitting
        if(eventArr.length == 1){  //if served, then remove the student 
            if(!studentQueue.isEmpty()){
                studentQueue.remove(0);
            }
        }else{ //if entry size is greater than one then add the entry to Queue
            StudentEntry s = new StudentEntry(Integer.parseInt(eventArr[3]),eventArr[1],Double.parseDouble(eventArr[2]));
            insertStudent(s);
        }      
         totalEvents--;
      }
        if(studentQueue.size() > 0){
            for(int i = 0;i <studentQueue.size();i++){
                System.out.println(studentQueue.get(i).getName());
            }
        }else{
            System.out.println("EMPTY");
        }
        in.close();
            
    }
}