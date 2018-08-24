    // Program zwraca true jeśli podane liczby z zakresu od 9 do 99 posiadają jedną wspólną cyfrę

    public class SharedDigit {

        public static boolean hasSharedDigit(int first, int second){

            if(first<10 | first>99 | second <10 | second >99)
                return false;

            int first1;
            int first2;
            int second1;
            int second2;

            first1=first%10;
            first/=10;
            first2=first%10;

            second1=second%10;
            second/=10;
            second2=second%10;

            if(first1==second1 | first2==second1 | first1==second2 | first2==second2)
                return true;
            else
                return false;
        }
    }
}
