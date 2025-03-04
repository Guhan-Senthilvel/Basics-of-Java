class Palindrome_StringBuilder{
    public static void main (String[] args) {
        String s="aasaa";
        StringBuilder sb=new StringBuilder(s);
        StringBuilder revStr = sb.reverse();
        if(s.equals(revStr.toString())){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}