class Solution {
    public List<List<Integer>> generate(int numRows) {
        // ek bahar ki arraylist 
        List<List<Integer>> res = new ArrayList<>();

        // rows banane ke liye pehela loop 
        for(int i = 0; i < numRows;i++){
            // main array list ko bharne wali arraylist 
            List<Integer> list = new ArrayList<>();

            // current row mai element bharne ke liye loop
            // loop j till it is less than or equal to i  
            for(int j=0;j<=i;j++){
                // doubt in this loop discuss 
                if(j>0 && i>0 && res.get(i-1).size()-1 >= j){

                    int element = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                    list.add(element);

                } else {
                 
                    list.add(1);
                }
            }
               res.add(list);
        }
        return res; 
    }
}