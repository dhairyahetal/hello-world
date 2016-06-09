Skip to content
This repository
Search
Pull requests
Issues
Gist
 @dhairyahetal
 Unwatch 1
  Star 0
  Fork 0 dhairyahetal/hello-world
 Code  Issues 0  Pull requests 0  Wiki  Pulse  Graphs  Settings
hello-world/ 
Name your file…
 or cancel
    
 Edit new file    Preview

//Main driver class

package javaapplication32;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import static javaapplication32.Person.PersonHeightComparator;
import static javaapplication32.Person.PersonNameComparator;
import static javaapplication32.Person.PersonSignComparator;

public class MyPeople {

    int count=0;
    
     


 public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {

        //create a arraylist of persons
     
        ArrayList<Person> people = new ArrayList<Person>();
      //creating an object if type person
        
        Person t = new Person();
        

     //start the menu
        
        System.out.println("Enter your choice\n 1:Add a person\n 2:Print list\n 3:Search\n4:Remove a person\n5:Sort by name\n6:Sort by signature\n7:Sort by height\t8:Randomise the list\t9:Print to files\t10:read from File\n 0 to exit");
        
        Scanner c=new Scanner(System.in);
        String choice1=c.next();
        int choice=Integer.parseInt(choice1);

        while(choice!=0)
        
        {

        System.out.println("Enter your choice\n 1:Add a person\n 2:Print list\n 3:Search\n4:Remove a person\n5:Sort by name\n6:Sort by signature\n7:Sort by height\t8:Randomise the list\t9:Print to files\t10:read from File\n 0 to exit");
        Scanner c1=new Scanner(System.in);
        choice1=c1.next();
         choice=Integer.parseInt(choice1);
        

         
         
         
         
         
         
         
         switch(choice)
        {
         case 1 :
         {//add the person to the arraylist after reading from the keyboard
             t.read(people);
             break;
         }
         case 2 :
         {
             //display to the screen
            t.display(people);
             break;
         }
         case 3 :
         {   //enter the signature to search for a person
             System.out.println("Enter the signature to search for a person ");
             Scanner in3=new Scanner(System.in);
             String key=in3.nextLine();
             t.search(key,people);
         
         break;
         }
         
         case 4:
         {
             System.out.println("Enter the signature to remove a person ");
             Scanner in3=new Scanner(System.in);
             String key=in3.nextLine();
             t.remove(key,people); //call the remove function in class person with the help of its object t
         
             break;
         }
         case 5:
         {
         System.out.println("Sorting by name");
         people.toArray();
         people.sort(PersonNameComparator);//call the appropriate sort function
         t.display(people);  
         break;  
         }
         case 6:
         {
             
         System.out.println("Sorting by signature");
         people.toArray();
         people.sort(PersonSignComparator);//call the appropriate sort function
         t.display(people);
         break;  
         }
         case 7:
         {
             System.out.println("Sorting by height");
              
         people.toArray();
         people.sort(PersonHeightComparator);//call the appropriate sort function
         t.display(people);    break;
         }
         case 8:
         {
             t.Randomize(people);//randomize the list
             break;
         }
        }}
        
        
         //writing to the file
                          t.writeFile(people);
System.out.println("Enter the key to encypt / decrypt and write/read from the file");
Scanner key1=new Scanner(System.in);
int key=Integer.parseInt(key1.next());
t.writeEncryptedFile(people,key);
t.readdecryptListfromFile(people, key);
         
         //reading contents of file
         
}
        //
     

}    
@dhairyahetal
Commit new file


MyPeople.java

Add an optional extended description…
  Commit directly to the readme-edits branch.
  Create a new branch for this commit and start a pull request. Learn more about pull requests.
Commit new file Cancel
Status API Training Shop Blog About
© 2016 GitHub, Inc. Terms Privacy Security Contact Help
