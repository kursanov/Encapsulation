import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Car car1 = new Car("Toyota","Land Cruiser",2022,"Black");


        Car car2 = new Car("BMW","X5",2005,"Black");


        Car car3 = new Car("Honda","Accord",2012,"Black");

        Car [] cars = {car1,car2,car3};

        for (Car s : cars) {
            System.out.println("\n"+s.getBrand() );
            System.out.println(s.getModel());
            System.out.println(s.getYear());
            System.out.println(s.getColor());
        }

        Person person1 = new Person("Zaripbek","Kursanov","Man",21);

        Person person2 = new Person("Zaripbek","Kursanov","Man",21);

        Person person3 = new Person("Zaripbek","Kursanov","Man",21);

        Person [] people = {person1,person2,person3};
        for (Person p: people) {
            System.out.println("\n" + p.getName());
            System.out.println( p.getSurName());
            System.out.println( p.getAge());

        }

        School school1 = new School("Toktogul","Con-kara","Nigh School");

        School school2 = new School("Gimnazia","Con-kara","Nigh School");

        School school3 = new School("#3","Con-kara","Nigh School");

        School [] schools= {school1,school2,school3};
        for (School d: schools) {
            System.out.println("\n" + d.getNameSchool());
            System.out.println(d.getAddress());
            System.out.println(d.getStatusSchool());

        }

        University university1 = new University("OshMU","Osh city");
        University university2 = new University("БГУ","Bishkek city");

        University [] universities = {university1,university2};
        for (University u: universities) {
            System.out.println("\n"+ u.getNameUniversity());
            System.out.println(u.getAddressUniversity());

        }






































//        Rectangle rectangle = new Rectangle();
//
//        rectangle.setLength(3);
//        rectangle.setWidth(4);
//
//
//        System.out.println("Аянты: " + rectangle.method());







    }
}