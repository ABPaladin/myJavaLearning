package ProiectNoiembrie;
public class Author {
    private String name;
    private String email;
    private char gender;
    private String author;

    public Author(String name, String email, char gender){
        this.email = email;
        this.name = name;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String newemail) {
      email = newemail;
    }
    public char getGender() {
        return gender;
    }
    public String getAuthor(){
        return author;
    }
        public String toString(){
        System.out.println(getName());
        System.out.println(getEmail());
        System.out.println(getGender());
        Author.this.setEmail("mike@mail");
        return null;
    }
}