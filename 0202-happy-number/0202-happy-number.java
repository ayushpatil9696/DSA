class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();

        while (hashSet.add(n)){

            int total = 0;

            while (n>0){

                total = total + (n%10)*(n%10);
                //% modules func gives remainder 
                n = n/10;
                //updating n 
            }

            if (total==1){
                return true;

            }

            else{
                n=total;
            }
        }
        
        return false;
    }
}