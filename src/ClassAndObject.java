public class ClassAndObject{
    public static void main(String[] args) {
        Car Audi=new Car();
        Audi.Name="Audi";
        Audi.Color="green";
        Audi.Date_Of_Manufacture=2020;
        Audi.Model_NUmber=123762513;

        Car BMW=new Car();
        BMW.Name="BMW";
        BMW.Color="green";
        BMW.Date_Of_Manufacture=2020;
        BMW.Model_NUmber=123762513;

        System.out.println(Audi.Name);
        System.out.println(Audi.Color);
        System.out.println(Audi.Date_Of_Manufacture);
        System.out.println(Audi.Model_NUmber);

        System.out.println(BMW.Name);
        System.out.println(BMW.Color);
        System.out.println(BMW.Date_Of_Manufacture);
        System.out.println(BMW.Model_NUmber);
    }
}
class Car{
    String Name;
    String Color;
    int Date_Of_Manufacture;
    int Model_NUmber;
}



