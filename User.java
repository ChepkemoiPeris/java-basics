import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
public class User {
   private String name;
   private LocalDate birthDay;
   private ArrayList<Book> books= new ArrayList<Book>();

   User(String name,String birthDay){
    this.name = name;
    this.birthDay = LocalDate.parse(birthDay);
   }

   public String getName(){
     return this.name;
   }

   public String getBirthday(){
    return this.birthDay.toString();
  }

   public void borrow(Book book){
    this.books.add(book);
   }

   public String borrowedBooks(){
    return this.books.toString();
   }

   public int age(){
        int age = Period.between(birthDay, LocalDate.now()).getYears();
        return age;
   }
}
