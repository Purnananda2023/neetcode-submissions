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
        
        while (i < str.length()) {
            int delimiterPos = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, delimiterPos));
            
            // Extract the string of the exact length
            String originalStr = str.substring(delimiterPos + 1, delimiterPos + 1 + length);
            result.add(originalStr);
            
            // Move pointer past the extracted string
            i = delimiterPos + 1 + length;
        }
        
        return result;
}
}
