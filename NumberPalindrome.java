public class NumberPalindrome{

    // Program sprawdza czy numer jest palindromem (taki sam ciąg znaków czytany od przod i od tyłu

    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int number){

        int reverse=0;
        int nNumber=number;

        while(nNumber!=0){
            int lastDigit=nNumber%10;
            reverse+=lastDigit;
            if(nNumber>=10 | nNumber<=-10)
                reverse*=10;
            nNumber/=10;
        }
        if(number==reverse)
            return true;

        else
            return false;
    }
}