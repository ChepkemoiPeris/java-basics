import java.time.LocalDate;

class OOP {
    public static void main(String[] args) {
        User user = new User("Peris milgo","1996-09-28");
        
        Book camilla = new Book("Carmilla","Sheriddan",22);
        AudioBook dracula = new AudioBook("draculla", "Bram stocker", 36000);
        
        System.out.println(dracula.toString());
    }
}
