public class StringCompression {
    /**
     * @param originalString: a string
     * @return: a compressed string
     */
    public String compress(String originalString) {
        if( originalString == null || originalString.isEmpty()) return originalString;
        // write your code here
      
         int i = 0;
         int j = 0;
         StringBuilder sb = new StringBuilder();
         while( j < originalString.length() ) {
              if( originalString.charAt(i) != originalString.charAt(j) ) {
                    sb.append (String.valueOf(originalString.charAt(i)) + String.valueOf(j-i));
                  
                 i = j;
                 j = i;
             }
            else  j++;
              
         }
           String result = sb.append(String.valueOf(originalString.charAt(i)) + String.valueOf(j-i)).toString();
          
          
          return (result.length()  < originalString.length() ? result : originalString);
    
        
    }
}