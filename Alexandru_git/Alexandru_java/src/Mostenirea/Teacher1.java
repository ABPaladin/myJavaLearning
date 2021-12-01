package Mostenirea;

public class Teacher1 {
    private String desifnation = "Teacher";
    private String coleggeName = "Beginnersbook";
    public String getDesifnation(){
        return desifnation;
    }
    protected void setDesifnation(String desifnation){
        this.desifnation = desifnation;
    }
    protected String getColeggeName(){
        return coleggeName;
    }
    protected void setColeggeName(String coleggeName){
    this.coleggeName = coleggeName;
    }
    void does(){
        System.out.println("Teaching");
    }
}
