// https://www.geeksforgeeks.org/problems/count-digits5716/1

public class CountDigits {
    static int evenlyDivides(int n) {
        // code here
        int temp = n;
        int rem = 0;
        int count =0;
        while(n>0){
            rem = n%10;
            if(rem!=0 && temp%rem==0)
                count++;
            n/=10;
        }
        return count;
    }
}
