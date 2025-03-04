class Palindrome_StringBuffer{
    public static void main (String[] args) {
        String s="aasaa";
        StringBuffer sb=new StringBuffer(s);
        StringBuffer revStr = sb.reverse();
        if(s.equals(revStr.toString())){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}