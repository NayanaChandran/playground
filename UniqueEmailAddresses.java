class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        if(emails.length == 0 || emails == null) return 0;
        Set<String> set = new HashSet<>();
        for(int i = 0; i < emails.length;i++) {

            //[pick out domain name at the beginning
            String domain = emails[i].substring(emails[i].indexOf('@'), emails[i].length());
            
            //Remove the dots
            String e = emails[i].replaceAll("\\.","");
            
           //check if + exists
            String ffinal = "";
            if(e.indexOf('+') != -1) {
                //add domain to everything before the '+'
                 ffinal = e.substring(0, e.indexOf('+')) + domain;
            
            }
            else {
                //add domain to everything before '@'
               ffinal = e.substring(0, e.indexOf('@')) + domain ; 
            }
           set.add(ffinal);
            
        }
        return set.size();
    }
    
}