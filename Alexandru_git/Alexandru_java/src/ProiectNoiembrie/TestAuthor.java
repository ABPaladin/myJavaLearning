package ProiectNoiembrie;
public class TestAuthor {
    public static void main(String[] args) {
        Author anAuthor = new Author("Alex","alexandru@mail",'m');
        System.out.println(anAuthor);
        anAuthor.setEmail("mike@mail.com");
        System.out.println(anAuthor.getEmail());
    }
}
