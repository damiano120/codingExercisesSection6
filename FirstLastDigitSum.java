public class FirstLastDigitSum {

    // Program oblicza sumę pierwszej i ostatniej cyfry z podanej liczby

    public static void main(String[] args) {

    }

    public static int sumFirstAndLastDigit(int number){

        int newNumber=number;
        int variable=0;
        int sum=0;

        if(number==0)
            return number;

        else if(newNumber<0)
            return -1;

        else{

            variable=newNumber%10;
            sum+=variable;

            while(newNumber>=10){
                newNumber/=10;
            }
            sum+=newNumber;
        }
        return sum;

    }

}