class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for(String str: strs) {
            builder.append(str.length()).append("#").append(str);
        }
        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;
        while(i < str.length()) {
            //Find the delimeter position
            int delimeterPos = str.indexOf("#", i);
            
            //Read the length appended before the delimeter
            int strLen = Integer.parseInt(str.substring(i, delimeterPos));

            //Read the actual String
            String s = str.substring(delimeterPos+1, delimeterPos+1+strLen);
            result.add(s);
            i = delimeterPos+1+strLen;      

        }
        return result;
    }
}
