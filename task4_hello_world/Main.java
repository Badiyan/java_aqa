public class Main {

    public static void main(String[] args) {

        Worker myObject = new Worker();
        String workerValue = myObject.getValue();
        System.out.println(String.format(
                String.join("","~~~",workerValue,"~~~")));

    }

}
