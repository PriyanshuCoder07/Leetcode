class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
    
        HashMap<Integer,Integer> defeat=new HashMap<>();
        for(int i=0; i<matches.length; i++){
            int lose=matches[i][1];
            defeat.put(lose,defeat.getOrDefault(lose,0)+1);
        }
        TreeSet<Integer> champ=new TreeSet<>();
        for(int i=0; i<matches.length; i++){
            int win=matches[i][0];
            if(!defeat.containsKey(win)){
                champ.add(win);

            }
        }
        TreeSet<Integer> loser=new TreeSet<>();
        for(int i=0; i<matches.length; i++){
            int lose=matches[i][1];
            if(defeat.get(lose)==1){
                loser.add(lose);

            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>(champ));
        ans.add(new ArrayList<>(loser));
        return ans;

        
    }
}