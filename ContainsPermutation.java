void main(){
    String s2 = "lecabee";
    String s1 = "cab";

    HashMap<Character, Integer> s1map = new HashMap<>();

    for(char c : s1.toCharArray()){
        s1map.put(c, s1map.getOrDefault(c, 0)+1);
    }

    HashMap<Character, Integer> s2Map = new HashMap<>();

    int left = 0;

    for(int right = s1.length()-1; right<s2.length(); right++){
        for(char c : s2.substring(left, right+1).toCharArray()){
            s2Map.put(c, s2Map.getOrDefault(c, 0)+1);
        }
        if(s1map.equals(s2Map)){
            IO.println("match");
        }
        s2Map.clear();
        left++;
    }
}
