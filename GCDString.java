void main() {
    String s1 = "ABABAB";
    String s2 = "AB";

    if(!(s1+s2).equals(s2+s1)){
        IO.println("Not GCD");
    }

    int gcdLen = gcd(s1.length(), s2.length());
    IO.println(s1.substring(0, gcd(s1.length(), s2.length())));

}

int gcd(int a, int b){
    if(b == 0){
        return a;
    }else {
        return gcd(b, a%b);
    }
}