package Condicionais;

public class SwitchString {
    public static void main(String[] args) {
        String s = "green";
        switch(s) {
            case "red": System.out.println("red");
            case "green": System.out.println("green");
            case "blue": System.out.println("blue");
            default: System.out.println("done");
        }
    }
}
