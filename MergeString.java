void main() {
    String s1 = "ab";
    String s2 = "pqrs";

    StringBuilder sb = new StringBuilder();

    int n = s1.length(), m = s2.length();

    int i = 0, j = 0;

    while(i < n || j < m){
        if(i < n){
            sb.append(s1.charAt(i));
            i++;
        }
        if(j < m){
            sb.append(s2.charAt(j));
            j++;
        }
    }

    IO.print(sb.toString());
}