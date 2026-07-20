class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        if(n==0){
            return a;
        }
        else{
            for(int i=1; i<n; i++){
                int temp = b;
                b=b+a;
                a=temp;
            }
            return b;
        }
    }
}