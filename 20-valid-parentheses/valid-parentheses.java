class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashSet<Character> set = new HashSet<>();
        set.add('(');
        set.add('{');
        set.add('[');
        if(!set.contains(s.charAt(0))) return false;
        for(int i =0;i<s.length();i++){
            char c =s.charAt(i);
            if(set.contains(c)){
                st.push(c);
            }else{
                 if (st.isEmpty()) return false;
                if(c==')'){
                    if(st.peek()=='('){
                        st.pop();
                    }else{
                        return false;
                    }
                }else if(c=='}'){
                    if(st.peek()=='{'){
                        st.pop();
                    }else{
                        return false;
                    }
                }else if(c==']'){
                    if(st.peek()=='['){
                        st.pop();
                    }else{
                        return false;
                    }
                }


            }
        }
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
        
    }
}