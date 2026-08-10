class Solution {
    public int findCenter(int[][] edges) {
        //star graph means har ek element kisi ek se connect hoga aur wo hme 
        // bs ek bar compare karne se pata chal jayga
        int first=edges[0][0];
        if(first==edges[1][0] || first==edges[1][1]) return first;

        return edges[0][1];
    }
}