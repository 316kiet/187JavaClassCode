public class methodcode {
    int id;
    String name;
    methodcode(){
        id=101;
        name="laxmi";
    }
    methodcode(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("This is parameterized constructor");
    }
    public void displayMethod(){
        System.out.println("Hello from display Method"); 
        System.out.println("Details are: " +id+" "+name);
    }
    public static void main(String[] args){
    methodcode m1=new methodcode();
    // m1.id=101;
    // m1.name="laxmi"
    m1.displayMethod();
    methodcode m2=new methodcode();
    m2.id = 101;
    m2.name ="laxmi";
    m2.displayMethod();
    methodcode m3=new methodcode(111,"Sneh");
    m3.displayMethod();
}
}

