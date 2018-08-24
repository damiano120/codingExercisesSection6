public class LastDigitChecker {

    // Program zwraca true jeśli przynajmniej dwie z trzech podanych liczb mają taką samą cyfrę z prawej strony

    public class LastDigitChecker {


        public static boolean hasSameLastDigit(int first, int second, int third){

            if(first<10 | first>1000 | second<10 | second>1000 | third<10 | third>1000)
                return false;

            first=first%10;
            second=second%10;
            third=third%10;

            if(first==second | first==third |second==third)
                return true;
            else
                return false;
        }
    }
}
