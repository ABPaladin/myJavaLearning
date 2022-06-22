package OOP;

public class Encapsulation {
    private String name;
    private String idNum;
    private int age;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getIdNume(){
        return idNum;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setName(String newName){
         name = newName;
    }
    public void setIdNum(String newId){
        idNum = newId;
    }
}
