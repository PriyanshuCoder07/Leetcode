class Solution {
    public List<String> removeInvalidParentheses(String s) {
        //ye hai Bfs ka question so understand it properly 
        List<String> ans=new ArrayList<>();
        //for bfs queue is must
        Queue<String> q=new LinkedList<>();
        //for uniqueness of every choice so we will take set here
        Set<String> visited=new HashSet<>();

        q.offer(s);
        visited.add(s);
        boolean found=false;
        while(!q.isEmpty()){
            int size=q.size();

            for(int i=0; i<size; i++){
                String current=q.poll();
                //agar mera current string valid h to ans me add krdo aur var ko bhi true karo
                if(isValid(current)){
                    ans.add(current);
                    found=true;
                }
                if(found) continue;
                //agar mera found true nii hai mtlb ki string valid nii hai so iterate and remove from it 
                for(int j=0; j<current.length(); j++){
                    char ch=current.charAt(j);
                    if(ch==')' || ch=='('){
                        String next=current.substring(0,j)+current.substring(j+1);

                            //now add it into the queue
                        if(!visited.contains(next)){
                            q.offer(next);
                            visited.add(next);
                        }
                    }
                    
                    // else{
                        // continue;
                    // }
                }
                if(found) break;
                // why because at the very first level if 
            }
        }
        return ans;


        
    }
    //String valid function for checking whether my string is valid or not
    public boolean isValid(String s){
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='(')count++;
            else{
                if(c==')'){
                    count--;
                }
                if(count<0) return false;
            }
        }
        return count==0;
        

    }
}