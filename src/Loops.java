public class Loops {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter something: ");
//        String userInput = sc.next().toLowerCase();

//        if(userInput.equals("hi")){
//            System.out.println("wassup");
//        } else if(userInput.equals("idk")) {
//            System.out.println("me either");
//        } else {
//            System.out.println("bye");
//        }


//        switch (userInput){
//            case "hi":
//                System.out.println("wassup");
//                break;
//            case "idk":
//                System.out.println("me either");
//                break;
//            default:
//                System.out.println("bye");
//        }


//        int caseSwitch = 1;
//
//        switch (caseSwitch) {
//            case 1:
//                System.out.println("Case 1");
//            case 2:
//                System.out.println("Case 2");
//            default:
//                System.out.println("Default case");
//                break;
//        }



//        int num = 1;
//        while (num <= 10){
//            if(num % 2 == 0){
//                System.out.println("Num is " + num);
//            }
//            num++;
//        }


//        int num = 1;
//
//        do {
//            System.out.println("You will always see me");
//
//        } while (num == 1);


        for (int i = 0; i < 10; i++) {
            if(i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }

    }
}
