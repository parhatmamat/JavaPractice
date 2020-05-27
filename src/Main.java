import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {

        Answerable phone = () -> {
            return "Hello";
        };
        System.out.println(phone.answer());
        Predicate isOdd = n -> n % 2 != 0;
        System.out.println(isOdd.test(2));

        Predicate isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(2));


/*        Dice dice1 = new Dice();
        System.out.println("Dice1 is created.");
        Dice dice2 = new Dice();
        System.out.println("Dice2 is created.");

        System.out.println("Please type '0' for exit; '1' for rolling the dice");

        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();

        while (userInput!=0) {
            dice1.roll();
            dice2.roll();

            System.out.println(dice1.faceSide + " " + dice2.faceSide);
            System.out.println("Please type '0' for exit; '1' for rolling the dice");
            userInput = in.nextInt();
        }*/

        System.out.println("Thanks for using this program");
/*        Coin c = new Coin();
        System.out.println("Initial: " + c.getFaceUp());

        for(int i=0; i<10; i++) {
            c.flip();
            System.out.println("After Flip: " + c.getFaceUp());
        }*/
/*        double squareRoot = Math.sqrt(64);
        System.out.println(squareRoot);

        Random rand = new Random();

        int randomNumber = rand.nextInt(20);

        System.out.println(randomNumber);*/

/*        System.out.println("For Loop");
        int x=3;
        do {
            System.out.println(x);
            x=x-1;
        } while (x>0);

        System.out.println("Final x:" + x);

        for(int i=3;i>0;i--){
            System.out.println("Current i:" + i);
        }
        System.out.println();*/
/*        System.out.println("Enter an age");

        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if (age >=0 && age <= 5) {
            System.out.println("Baby");
        } else if (age>=6 && age <=11) {
            System.out.println("Kid");
        } else if (age>=12 && age <=17) {
            System.out.println("Teen");
        } else if (age>=18) {
            System.out.println("Adult");
        } else {
            System.out.println("Invalid");
        }*/

/*        Dog myDog = new Dog("ted", Color.BLUE, 2);

        myDog.patDog();

        myDog.fetch();

        System.out.println(myDog.toString());

        myDog.fetch();

        System.out.println(myDog.toString());

        myDog.fetch();

        System.out.println(myDog.toString());
        myDog.fetch();

        System.out.println(myDog.toString());*/

/*        String s="dog";
        String replacedF=s.replace('d','F');
        System.out.println(replacedF);*/

/*        Car myCar = new Car(25.5,"1BC29G", Color.BLUE, true);

        double myCarSpeed =50;
        myCarSpeed=myCar.speedingUp(myCarSpeed);
        System.out.println(myCarSpeed);*/

  /*      // 31, 45, 22, 98, 10
        int[] numbers=new int[5];
        numbers[0] = 31;
        numbers[1]=45;
        numbers[2]=22;
        numbers[3]=98;
        numbers[4]=10;

        int[] numbers2={31, 45, 22, 98, 10};

        String[] myFavoriteCandyBars = {"Twix", "Hershey's", "Crunch"};
        System.out.println(myFavoriteCandyBars[0]);
        System.out.println(myFavoriteCandyBars[1]);
        System.out.println(myFavoriteCandyBars[2]);

        myFavoriteCandyBars[2]="Butterfinger";
        System.out.println(myFavoriteCandyBars[2]);
        System.out.println("Length:" + myFavoriteCandyBars.length);

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));*/

/*        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        System.out.println(userNumber);
        double userNumber2 = sc.nextDouble();
        System.out.println(userNumber2);*/

/*        //String userInput = "entertainment";
        System.out.println(userInput.toUpperCase());*/

/*        char firstCharacter = userInput.toUpperCase().charAt(0);
        System.out.println(firstCharacter);
        System.out.println("Contains : " + userInput.contains("enter"));

        System.out.println("Hello World");
        System.out.println("Test");

*//*        Car myCar = new Car(25.5,"1BC29G", Color.BLUE, true);
        Car sallyCar = new Car(13.9, "Test", Color.BLACK, false);

        System.out.println("My car's license plate: "+ myCar.licensePlate);
        System.out.println("Sally's car's license plate: " + sallyCar.licensePlate);

        System.out.println(myCar.paintColor.toString());
        myCar.changePaintColor(Color.RED);
        System.out.println(myCar.paintColor.toString());*/


    }


    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     * sleepIn(false, false) → true
     * sleepIn(true, false) → false
     * sleepIn(false, true) → true
     *
     * @param weekday
     * @param vacation
     * @return
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation == true) {
            return true;
        } else return weekday == false;
    }

    /**
     * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
     * <p>
     * <p>
     * monkeyTrouble(true, true) → true
     * monkeyTrouble(false, false) → true
     * monkeyTrouble(true, false) → false
     */

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == true) {
            return bSmile == true;
        } else {
            return bSmile != true;
        }
    }

    /**
     * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
     * <p>
     * <p>
     * sumDouble(1, 2) → 3
     * sumDouble(3, 2) → 5
     * sumDouble(2, 2) → 8
     */

    public int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else
            return a + b;
    }

    /**
     * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
     * <p>
     * <p>
     * diff21(19) → 2
     * diff21(10) → 11
     * diff21(21) → 0
     */
    public int diff21(int n) {
        if (n <= 21) {
            return abs(n - 21);
        } else return 2 * abs(n - 21);
    }

    /**
     * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
     * <p>
     * <p>
     * parrotTrouble(true, 6) → true
     * parrotTrouble(true, 7) → false
     * parrotTrouble(false, 6) → false
     */
    public boolean parrotTrouble(boolean talking, int hour) {

        return talking && (hour < 7 || hour > 20);

    }

    /**
     * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
     * <p>
     * <p>
     * makes10(9, 10) → true
     * makes10(9, 9) → false
     * makes10(1, 9) → true
     */

    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10) || (a + b == 10);
    }

    /**
     * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
     * <p>
     * <p>
     * nearHundred(93) → true
     * nearHundred(90) → true
     * nearHundred(89) → false
     */

    public boolean nearHundred(int n) {
        return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;
    }

    /**
     * Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
     * <p>
     * <p>
     * posNeg(1, -1, false) → true
     * posNeg(-1, 1, false) → true
     * posNeg(-4, -5, true) → true
     */

    public boolean posNeg(int a, int b, boolean negative) {
        return (a * b < 0 && negative == false) || (negative == true && a < 0 && b < 0);
    }

    /**
     * Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
     * <p>
     * <p>
     * notString("candy") → "not candy"
     * notString("x") → "not x"
     * notString("not bad") → "not bad"
     */
    public String notString(String str) {
        if (str.length() >= 3) {

            if (str.startsWith("not") == false) {
                str = "not " + str;
            }

        } else str = "not " + str;

        return str;

    }

    /**
     * Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
     * <p>
     * <p>
     * missingChar("kitten", 1) → "ktten"
     * missingChar("kitten", 0) → "itten"
     * missingChar("kitten", 4) → "kittn"
     */
    public String missingChar(String str, int n) {
        str = str.replaceFirst(Character.toString(str.charAt(n)), "");
        return str;
    }

    /**
     * Given a string, return a new string where the first and last chars have been exchanged.
     * <p>
     * <p>
     * frontBack("code") → "eodc"
     * frontBack("a") → "a"
     * frontBack("ab") → "ba"
     */
    public String frontBack(String str) {
        if (str.length() > 1) {
            str = str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0, 1);
        }

        return str;
    }

    /***
     *
     Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.


     front3("Java") → "JavJavJav"
     front3("Chocolate") → "ChoChoCho"
     front3("abc") → "abcabcabc"
     */
    public String front3(String str) {
        if (str.length() >= 3) {
            str = str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
        } else if (str.length() == 2) {
            str = str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        } else if (str.length() == 1) {
            str = str + str + str;
        }

        return str;
    }

}
