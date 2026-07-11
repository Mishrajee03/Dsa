class Solution {
    public String defangIPaddr(String address) {
        
        // for(int i=0;i<address.length();i++){
        //     char ch=address.charAt(i);
        //     if(ch=="."){
        //         address.replace(".","[.]");
        //     }
        // }
        String str=address.replace(".","[.]");
        return str;
    }
}