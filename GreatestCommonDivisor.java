    public class GreatestCommonDivisor {

    // Program zwraca największy wspólny mianownik podanych liczb

        public static int getGreatestCommonDivisor(int first, int second){

            if(first<10 | second<10)
                return -1;

            int variable1=0;
            int variable2=0;

            if(first>=second){
                for(int i=1; i<=second;i++){
                    if(first%i==0 & second%i==0) {
                        variable1 = i;
                    }
                }
                return variable1;
            }

            else {
                for(int i=1; i<=first;i++){
                    if(first%i==0 & second%i==0)
                        variable2=i;
                }
                return variable2;
            }
        }
    }
}
