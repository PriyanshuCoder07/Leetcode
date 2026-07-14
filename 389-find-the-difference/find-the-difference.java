class Solution {
    public char findTheDifference(String s, String t) {
        //Approach 3 using xor
        int xor=0;
        for(int i=0; i<s.length(); i++){
            xor=xor^s.charAt(i);

        }
        for(int i=0; i<t.length(); i++){
            xor=xor^t.charAt(i);
        }
        return (char)xor;

        //Approach 2
        // int sum1=0;
        // for(int i=0; i<s.length(); i++){
        //     sum1+=s.charAt(i);
        // }
        // int sum2=0;
        // for(int i=0; i<t.length(); i++){
        //     sum2+=t.charAt(i);
        // }
        // return (char)(sum2-sum1);

        //Approach 1
        // HashMap<Character, Integer> mp=new HashMap<>();
        // for(int i=0; i<s.length(); i++){
        //     mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        // }
        // for(int i=0; i<t.length(); i++){
        //     char c=t.charAt(i);
        //     mp.put(c,mp.getOrDefault(c,0)-1);

        //         if(mp.get(c)<0){
        //             return c;
        //         }
        // }
        // //flow of execution will never reach here;
        // return 'x';
        
    }
}