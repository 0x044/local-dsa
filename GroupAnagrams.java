void main() {

    List<String> test = Arrays.asList("act", "pots", "tops", "cat", "stop", "hat");
    HashMap<String, ArrayList<String>> resmap = new HashMap<>();

    for (int i = 0; i < test.size(); i++) {
        String currentword = test.get(i);
        int[] sign = new int[26];
        for (int j = 0; j < currentword.length(); j++) {
            sign[currentword.charAt(j) - 'a'] += 1;
        }

        resmap.computeIfAbsent(Arrays.toString(sign), k -> new ArrayList<>()).add(currentword);
    }

    ArrayList<ArrayList<String>> reslist = new ArrayList<ArrayList<String>>(resmap.values());

    IO.println(reslist);
}