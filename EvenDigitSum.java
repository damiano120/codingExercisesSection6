    // Program oblicza sumę cyfr parzystych podanej liczby

    public class EvenDigitSum {

        public static int getEvenDigitSum(int number){

            if(number<0)
                return -1;

            if(number<10){
                if(number%2==0)
                    return number;
                else
                    return 0;
            }

            int newNumber=number;
            int sum=0;
            int variable=0;

            while(newNumber!=0){
                variable=newNumber%10;
                if(variable%2==0)
                    sum+=variable;
                newNumber/=10;
            }
            return sum;
        }
    }
}
