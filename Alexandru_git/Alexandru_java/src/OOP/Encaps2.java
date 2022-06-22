package OOP;

public class Encaps2 {
    private  int ssn;
    private  String empName;
    private int empAge;
    public int getEmpSSN(){
        return ssn;
    }
    public String getEmpName(){
        return empName;
    }
    public int getEmpAge(){
        return empAge;
    }
    public void setEmpAge(int newValue){
        empAge=newValue;
    }
    public void setEmpName(String newValue){
        empName = newValue;
    }
    public void setEmpSSN(int newValue){
        ssn=newValue;
    }
}
