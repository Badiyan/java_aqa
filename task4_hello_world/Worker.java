public class Worker {

    public int someValue = 42;

    public String getValue() {
        String  updatedValue = String.format("---%d---", someValue);
        System.out.println(updatedValue);
        return updatedValue;
    }

}
