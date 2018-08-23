public class NumberOfDaysInMonth {

    // Program znajduje rok przestępny i podaje liczbę dni w miesiącu

    public static void main(String[] args) {

    }

        public static boolean isLeapYear(int year){

            if (year>=1 && year<=99 && year%4==0)
                return true;
            else if(year>99 && year<=399 && year%4==0 && year%100!=0)
                return true;
            else if (year>399 && year<=9999 && year%4==0 && (year%100!=0 || year%400==0))
                return true;
            else
                return false;

        }

        public static int getDaysInMonth(int month, int year){

            if(month<1 | month>12 | year<1 | year>9999)
                return -1;

            else if (month==1 | month==3 | month==5 | month==7 | month==8 | month==10 | month==12)
                return 31;

            else if (month==4 | month==6 | month==9 | month==11)
                return 30;

            else if (month==2) {
                if (isLeapYear(year))
                    return 29;
                else if (!isLeapYear(year))
                    return 28;
            }
//        else
            return -1;
        }
    }
}
