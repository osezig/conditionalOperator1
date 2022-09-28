public class Main {
    public static void main(String[] args) {
        int humanAge = 8;
        if (humanAge >= 7 && humanAge < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (humanAge >= 18 && humanAge < 24) {
            System.out.println("Человек в университете");
        }
        if (humanAge >= 24 && humanAge < 18) {
            System.out.println("Человек ходит на работу");
        }
    }
}