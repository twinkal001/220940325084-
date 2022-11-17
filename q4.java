class GrandParent {
    String grandFatherName;
    String grandMotherName;
    public GrandParent(String grandFatherName, String grandMotherName ) {
        this.grandFatherName = grandFatherName;
        this.grandMotherName = grandMotherName;
        System.out.println( "My GrandFatherName is "+grandFatherName);
        System.out.println( "My GrandMotherName is "+grandMotherName);

    }
}
class Parent extends GrandParent{
    String fatherName;
    String motherName;

    public Parent(String grandFatherName, String grandMotherName, String fatherName, String motherName ) {
        super(grandFatherName, grandMotherName);
        this.fatherName = fatherName;
        this.motherName = motherName;
        System.out.println("My FatherName is "+fatherName);
        System.out.println("My MotherName is "+motherName);
    }

}
class Child extends Parent {

    public Child(String grandFatherName, String grandMotherName, String fatherName, String motherName) {
        super(grandFatherName, grandMotherName, fatherName, motherName);

    }
}
public class q4 {
    public static void main(String[] args) {
        Child c_obj = new Child("Vasudev","Rajani","Vilas","Vandana");

    }
}