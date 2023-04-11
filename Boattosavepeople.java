
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int a=0;
        int l=people.length-1;

            for(int i=0; i<=l;){
                if(people[i] + people[l] <= limit){
                    a++;
                    i++;
                    l--;
                }
                else{
                    a++;
                    l--;
                }
            }
                return a;
    }
}