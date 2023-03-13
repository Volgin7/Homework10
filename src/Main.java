public class Main {
    public static void main(String[] args) {

        task1();

    } // end of main


    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    } // end of task

} // end of Main