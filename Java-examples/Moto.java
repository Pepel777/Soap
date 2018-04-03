public class Moto {
    String name;
    int year;
    Moto (String motoName) {
        name = motoName;
    }
    Moto (String motoName, int motoYear) {
        name = motoName;
        year = motoYear;
    }
    public void drive (){
        System.out.println(name + " is driving");
    }
}
