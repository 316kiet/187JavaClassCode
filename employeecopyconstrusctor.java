public class employeecopyconstrusctor {
    int Emp_id;
    String Emp_name;
    employeecopyconstrusctor(int i,String name){
        Emp_id=i;
        Emp_name=name;
    }
    void printInfo(){
        System.out.println("Details of the employee are: "+ Emp_id+" "+Emp_name);
    }
    employeecopyconstrusctor(employeecopyconstrusctor s2){
        Emp_id=s2.Emp_id;
        Emp_name=s2.Emp_name;
    }
    public static void main(String[] args) {
        employeecopyconstrusctor ecc= new employeecopyconstrusctor(101, "sneh");
        ecc.printInfo();
        employeecopyconstrusctor copy = new employeecopyconstrusctor(ecc);
        copy.Emp_id=200;
        ecc.Emp_id=200;
        ecc.printInfo();
    }
}
