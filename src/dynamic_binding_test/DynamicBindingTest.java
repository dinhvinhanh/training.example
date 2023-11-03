package dynamic_binding_test;

class India {

    public void locate() {
        System.out.println("We are in India");
    }
}

class SubIndia extends India {

    @Override
    public void locate() {
        System.out.println("We are in Delhi");
    }
}

public class DynamicBindingTest {

    public static void main(String args[]) {
        // Method of super class or parent class is called
        India superobj = new India();
        superobj.locate();

        // Method of sub class or child class is called by Parent reference,
        // this is called "Dynamic Binding"
        India subobj = new SubIndia(); // upcasting
        subobj.locate();

        SubIndia subobj2 = new SubIndia();
        subobj2.locate(); // method of sub class or child class is called

        // downcasting
        India india = new SubIndia();
        SubIndia subIndia = (SubIndia) india;
        subIndia.locate();

        SubIndia subIndia2 = (SubIndia) india;
        subIndia2.locate();
    }
}