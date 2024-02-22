package oops.Example3;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String secondName;
    private String surname;
    private int age;
    public Person(String firstName,String secondName, String surname, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
        this.age = age;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public String getSecondName(){
        return this.secondName;
    }

    public String getSurname(){
        return this.surname;
    }

    public int getAge(){
        return this.age;
    }
    public String getFullNames(){
        return firstName + " " + secondName + " " + surname;
    }

    public void setFirstName(String first_name){
        this.firstName = first_name;
    }

    public void setSecondName(String second_name){
        this.secondName = second_name;
    }
    public void setSurname(String new_surname){
        this.surname = new_surname;
    }
    public void setAge(int new_age){
        this.age = new_age;
    }

    public static void main(String[] arg){
        System.out.print("Enter firstName: ");
        Scanner firstNameScanner = new Scanner(System.in);
        String enteredFirstName = firstNameScanner.nextLine();
        System.out.print("Enter second name: ");
        Scanner secondNameScanner = new Scanner(System.in);
        String enteredSecondName = secondNameScanner.nextLine();
        System.out.print("Enter surname: ");
        Scanner surnameScanner = new Scanner(System.in);
        String enteredSurname = surnameScanner.nextLine();
        System.out.print("Enter your age: ");
        Scanner ageScanner = new Scanner(System.in);
        int enteredAge = ageScanner.nextInt();
        Person person = new Person(enteredFirstName, enteredSecondName, enteredSurname, enteredAge);
        System.out.println(person.getFullNames());
        System.out.print("Do you want to make a change(y/n)");
        Scanner userOption = new Scanner(System.in);
        String userAns = userOption.next();
        if(userAns.equalsIgnoreCase("y")){
            System.out.print("Enter new first name");
            Scanner newFirstName = new Scanner(System.in);
            String enteredNewFirstName = newFirstName.nextLine();
            person.setFirstName(enteredNewFirstName);
            System.out.println(person.getFullNames());
        }
    }
}
