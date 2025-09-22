public class SwitchStatementPractice {
    public static void main(String[] args) {
        System.out.println("=== SWITCH STATEMENT EXERCISES ===\n");

        // TODO 1: Day of Week
        int dayNumber = 3;
        switch (dayNumber) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }

        // TODO 2: Grade to GPA
        char letterGrade = 'A';
        switch (letterGrade) {
            case 'A' -> System.out.println("4.0 GPA");
            case 'B' -> System.out.println("3.0 GPA");
            case 'C' -> System.out.println("2.0 GPA");
            case 'D' -> System.out.println("1.0 GPA");
            case 'F' -> System.out.println("0.0 GPA");
            default -> System.out.println("Invalid grade");
        }

        // TODO 3: Month Days
        int month = 4;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days");
            case 4, 6, 9, 11 -> System.out.println("30 days");
            case 2 -> System.out.println("28 or 29 days");
            default -> System.out.println("Invalid month");
        }

        // TODO 4: Traffic Light Action
        String trafficLight = "yellow";
        switch (trafficLight.toLowerCase()) {
            case "red" -> System.out.println("Stop and wait");
            case "yellow" -> System.out.println("Prepare to stop");
            case "green" -> System.out.println("Go safely");
            default -> System.out.println("Invalid signal");
        }

        // TODO 5: Calculator Operations
        char operation = '*';
        switch (operation) {
            case '+' -> System.out.println("Addition operation");
            case '-' -> System.out.println("Subtraction operation");
            case '*' -> System.out.println("Multiplication operation");
            case '/' -> System.out.println("Division operation");
            default -> System.out.println("Unknown operation");
        }

        // TODO 6: Season by Month
        int seasonMonth = 7;
        switch (seasonMonth) {
            case 12, 1, 2 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Fall");
            default -> System.out.println("Invalid month");
        }

        // TODO 7: Exam Grade Range
        int examScore = 85; // Hint: use examScore/10 in switch
        switch (examScore / 10) {
            case 10, 9 -> System.out.println("Excellent");
            case 8 -> System.out.println("Very good");
            case 7 -> System.out.println("Good");
            case 6 -> System.out.println("Satisfactory");
            default -> System.out.println("Needs improvement");
        }

        // TODO 8: Browser Type
        String browser = "chrome";
        switch (browser.toLowerCase()) {
            case "chrome" -> System.out.println("Google Chrome browser");
            case "firefox" -> System.out.println("Mozilla Firefox browser");
            case "safari" -> System.out.println("Apple Safari browser");
            case "edge" -> System.out.println("Microsoft Edge browser");
            default -> System.out.println("Unknown browser");
        }

        // TODO 9: Priority Level
        int priority = 2;
        switch (priority) {
            case 1 -> System.out.println("Critical priority");
            case 2 -> System.out.println("High priority");
            case 3 -> System.out.println("Medium priority");
            case 4 -> System.out.println("Low priority");
            default -> System.out.println("Invalid priority");
        }

        // TODO 10: File Extension
        String fileExtension = "png";
        switch (fileExtension.toLowerCase()) {
            case "jpg", "png", "gif" -> System.out.println("Image file");
            case "mp4", "avi", "mkv" -> System.out.println("Video file");
            case "txt", "doc", "pdf" -> System.out.println("Document file");
            default -> System.out.println("Unknown file type");
        }
    }
}
