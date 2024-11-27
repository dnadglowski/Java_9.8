public class App {
     class FanSpeedController {
        // Declare constants at the class level
        private static final int SLOW = 1;
        private static final int MEDIUM = 2;
        private static final int FAST = 3;
    public static void main(String[] args) {
            System.out.println("--------------");
            defaults();     //runs class
            System.out.println("--------------");
            test1();      //runs test1
            System.out.println("--------------");
            test2();

    }
    private static void defaults() {
        // sets all the default values 
        int fanSpeedDefault = SLOW;
        int radius = 5;
        boolean fan = false;
        String color = "blue";
        String fanstatus = "";
//finds if fan is on or off
        if (!fan){
             fanstatus = "off";
        }else {
             fanstatus = "on";
        }
//prints all default settings 
        System.out.println("Fan default settings");
        System.out.println("Fan default speed: " + fanSpeedDefault);
        System.out.println("Fan default radius: " + radius);
        System.out.println("Is fan on or off: " + fanstatus);
        System.out.println("Fan color: " + color);

    }
    private static void test1() {
        int fanSpeedDefault = FAST;
        int radius = 10;
        boolean fan = true;
        String color = "yellow";
        String fanstatus = "";

        if (!fan){
             fanstatus = "off";
        }else {
             fanstatus = "on";
        }

        System.out.println("Test 1");
        System.out.println("Fan default speed: " + fanSpeedDefault);
        System.out.println("Fan default radius: " + radius);
        System.out.println("Is fan on or off: " + fanstatus);
        System.out.println("Fan color: " + color);
    }
    private static void test2() {
        int fanSpeedDefault = MEDIUM;
        int radius = 5;
        boolean fan = false;
        String color = "blue";
        String fanstatus = "";

        if (!fan){
             fanstatus = "off";
        }else {
             fanstatus = "on";
        }

        System.out.println("Test 2");
        System.out.println("Fan default speed: " + fanSpeedDefault);
        System.out.println("Fan default radius: " + radius);
        System.out.println("Is fan on or off: " + fanstatus);
        System.out.println("Fan color: " + color);
    }
    }
}
