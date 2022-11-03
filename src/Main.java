import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        University university1 = new University();
        university1.setName("Bishkek Humanitarian University");
        university1.setYearOfStart(1979);
        university1.setStructure(3);
        university1.setLocation("Bishkek");

        University university2 = new University();
        university2.setName("Manas");
        university2.setYearOfStart(1995);
        university2.setStructure(5);
        university2.setLocation("Bishkek");

        University university3 = new University();
        university3.setName("Ala-Too Atataturk");
        university3.setYearOfStart(1996);
        university3.setStructure(4);
        university3.setLocation("Bishkek");

        Scanner scanner = new Scanner(System.in);
        String univesity = scanner.nextLine();
        System.out.println("Write the name Universitys: ");
        universitys(new String[]{"Bishkek Humanitarian University,Manas,Ala-Too Atataturk"});


        School school1 = new School();
        school1.setName(" SSh im Gagarina");
        school1.setStructure(5);
        school1.getLocation("Razakov");

        School school2 = new School();
        school2.setName("9-Gymnasium");
        school2.setStructure(4);
        school2.getLocation("Bishkek");

        School school3 = new School();
        school3.setName(" SSh im Pushkina");
        school3.setStructure(3);
        school3.getLocation("Ysyk Kul");

        Scanner scanner1 = new Scanner(System.in);
        String school = scanner1.nextLine();
        System.out.println("Write the name schools: ");
       schools(new String[]{"SSh im Gagarina,9-Gymnasium,SSh im Pushkina"});


        Car car1 = new Car();
        car1.setName("600");
        car1.setCarBrend("Mersedes");
        car1.setColor("Silver");

        Car car2 = new Car();
        car2.setName("X3 M");
        car2.setCarBrend("BMV");
        car2.setColor("Black");

        Car car3 = new Car();
        car3.setName("YARIS CROOS");
        car3.setCarBrend("Toyota");
        car3.setColor("White");

        Scanner scanner2 = new Scanner(System.in);
        String car = scanner2.nextLine();
        System.out.println("Write the name cars");
        cars(new String[]{"car1,car2,car3"});

        Person person1 = new Person();
        person1.setName("Inna ");
        person1.setNationality("Russian");
        person1.setAge(21);
        person1.setMarried("single");

        Person person2 = new Person();
        person2.setName("Imran ");
        person2.setNationality("Uighur");
        person2.setAge(25);
        person2.setMarried("married");

        Person person3 = new Person();
        person3.setName("Aziza ");
        person3.setNationality("Kyrgyz");
        person3.setAge(23);
        person3.setMarried("single");

        Scanner scanner3 = new Scanner(System.in);
        String person = scanner3.nextLine();
        System.out.println("Write the name persons");
        persons(new String[]{"Inna,Imran,Aziza"});

    }

    public static void universitys(String[] universitys) {
        String[] university = {"Bishkek Humanitarian University,Manas,Ala-Too Atataturk"};
        System.out.println(Arrays.toString(university));

    }
     public static void schools(String [] schools){
     String [] school={"SSh im Gagarina,9-Gymnasium,SSh im Pushkina"};
       System.out.println(Arrays.toString(school));

   }
    public static void cars(String [] cars){
        String [] car={"Mersedes,BMV,Toyota"};
        System.out.println(Arrays.toString(car));
    }
    public static void persons(String[] persons){
        String [] person={"Inna,Imran,Aziza"};
        System.out.println(Arrays.toString(persons));
    }



}