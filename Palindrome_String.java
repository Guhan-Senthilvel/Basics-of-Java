class Palindrome_String{
    public static void main(String[] args){
        String s=",.@a1a@.,",temp="";
        int i=s.length()-1;
        while(i>=0){
            temp=temp+s.charAt(i);
            i--;
        }
        System.out.print(temp);
        System.out.println();
        if (s.equals(temp)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}