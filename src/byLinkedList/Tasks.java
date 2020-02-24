package byLinkedList;
import java.util.LinkedList;
import java.util.Scanner;


public class Tasks {
    Scanner scanner=new Scanner(System.in);
    LinkedList<String> linkedList =new LinkedList<>();
    public void addContact(LinkedList1 linkedList1){
        System.out.println("You have chosen to add a new contact: \n"+
                "please enter the name of the Person");
        System.out.println("First NAme :");
        String firstName = scanner.nextLine().trim();
        while (true) {
            if (firstName.matches("[A-Za-z]+")) {
                break;

            } else {
                System.out.println("please enter correct name");
            }
            firstName = scanner.nextLine().trim();
        }
        System.out.println("Last Name : ");
        String lastName = scanner.nextLine().trim();
        while (true){
            if(lastName.matches("[A-Za-z]+")){
                break;

            }else {
                System.out.println("Please enter correct name");
            }
            lastName= scanner.nextLine().trim();

        }
        System.out.println("Contact number: ");
        while(true) {
            String contact = scanner.nextLine().trim();
            if (contact.matches("[0-9]{10}")) {
                linkedList.add(contact);
                break;

            }
        }
        while(true){
            System.out.println("Would you like to add another contact(y/n) :");
            char choice = scanner.nextLine().charAt(0);
            if(choice =='y'){
                System.out.println("Contact number :");
                String contactNumber1 = scanner.nextLine().trim();
                while(true) {
                    if (contactNumber1.matches("[0-9]{10}")) {
                        linkedList.add(contactNumber1);
                        break;
                    } else {
                        System.out.println("Add correct number");
                    }
                }

                    }else {
                break;
            }

            }
            System.out.println("Enter your email address");
        scanner.nextLine();
        while(true) {
            String temp = scanner.nextLine();
            if (temp.matches("^[a-z]+[0-9]*@[a-z]+\\.[a-z]+$")){
                LinkedList1.addLast(new Person(firstName, lastName, linkedList, temp));
            break;
        }
        else {
                System.out.println("Invalid email address");

            }
        }

        }
        public void viewcontact(LinkedList1 linkedList1) {
            System.out.println("---here are all your contacts---");
            if (!linkedList1.isEmpty()) {
                linkedList1.display();
            } else {
                System.out.println("no result found");
            }
        }
        public void deleteContacts(LinkedList1 linkedList1){
        if(!linkedList1.isEmpty()) {
            System.out.println("--");
            linkedList1.displayOne();
            int choice = scanner.nextInt();
            scanner.nextLine();
            linkedList1.deleteNode(choice);
            linkedList1.displayOne();
            System.out.println("deleted");
        }
        else {
            System.out.println("no contacts");
        }
        }
public void searchContact(LinkedList1 linkedList1){
        System.out.println(" you could search a contact from name");
        String firstName = scanner.nextLine().trim();
        if(linkedList1.indexOF(firstName)>=0)
        {System.out.println{"match")
            linkedList1.getNode(linkedList1.indexOf(firstName));
        } else {
            System.out.println("No match found");
        }}








