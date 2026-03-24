class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        int[] psm = new int[n];
        int[] nsm = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
          nsm[i]= st.isEmpty()? n:st.peek();

            st.push(i);
        }
        while(st.size()>0)st.pop();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
           psm[i]= st.isEmpty()? -1:st.peek();

            st.push(i);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int currarea=heights[i]*(nsm[i]-psm[i]-1);
            ans= ans>currarea? ans:currarea;
        }
        return ans;
        
    }
}