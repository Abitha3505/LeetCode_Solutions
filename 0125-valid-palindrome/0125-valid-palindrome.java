class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i)))
                sb.append(s.charAt(i));
        }
        String str=sb.toString();
        char[] arr=str.toCharArray();
        int right=sb.length()-1;
        int left=0;
        boolean flag=true;
        while(left<right){
            if(arr[left]!=arr[right]){
                flag=false;
            }
            left++;
            right--;
        }
        if(flag)
            return true;
        else
            return false;
    }
}