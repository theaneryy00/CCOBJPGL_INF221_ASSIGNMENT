public class Pet implements PersianBritishShorthair {
    
    String name = "I have a cat named Cali";
    String age = "He is 1 year old.";
    
    @Override
    public void meow() {
        System.out.println("My cat is hungry");
    };
}
