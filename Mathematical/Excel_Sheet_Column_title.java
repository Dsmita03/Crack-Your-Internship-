package Mathematical;

    class Solution {
        public String convertToTitle(int columnNumber) {
            StringBuilder sb = new StringBuilder();
            while(columnNumber > 0){
                char ch = (char) ('A' + (--columnNumber%26));
                sb.insert(0,ch);
                columnNumber = columnNumber/26;
            }
            
            return sb.toString();
        }
    } 

