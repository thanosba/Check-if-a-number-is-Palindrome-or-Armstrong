public class testNumber {

    public static void main(String[] args) {

        int am = 877512345; //Input number to check armstrong - palindrome
        int tempNumber, digit, digitCubeSum = 0;
        int lastDigit,sum=0;
        int flag = 0;
        int flag2 = 0;

        tempNumber = am;
        while (tempNumber != 0)
        {
            System.out.println("Current Number is "+tempNumber);
            digit =tempNumber % 10;
            System.out.println("Current Digit is "+digit);
            digitCubeSum = digitCubeSum + digit*digit*digit;
            System.out.println("Current digitCubeSum is "+digitCubeSum);
            tempNumber /= 10;

        }

        if(digitCubeSum == am){
            System.out.println(am + " is an Armstrong Number");
            flag = 1;}
        else
            System.out.println(am + " is not an Armstrong Number");

        while(am>0)
        {   System.out.println("Input Number "+am);
            lastDigit=am%10; //getting remainder
            System.out.println("Last Digit "+lastDigit);
            System.out.println("Digit "+lastDigit+ " was added to sum "+(sum*10));
            sum=(sum*10)+lastDigit;
            am=am/10;

        }
        if(sum==am){
            System.out.println("Number is palindrome ");
            flag2 = 2;}
        else
            System.out.println("Number is not palindrome");

        if (flag != flag2) {
            System.out.println("Perfect!! Number is Palindrome & Armstrong");
        }
    }
}

