public class Solution {
    public ArrayList<Integer> findOccurences(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for(int i=0;i<A.size();i++){
            mp.put(A.get(i), mp.getOrDefault(A.get(i),0)+1);
        }
        Collections.sort(A);
        for(int i=0;i<A.size();i++){
            if(mp.containsKey(A.get(i))){
                res.add(mp.get(A.get(i)));
                mp.remove(A.get(i));
            }
        }
        return res;
    }
}
