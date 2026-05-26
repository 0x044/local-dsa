void main() {
    String s = "dvdf";
    HashMap<Character, Integer> dupeIndex = new HashMap<>();
    int maxCount = 0;
    int left = 0;

    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);

        if (dupeIndex.containsKey(c) && dupeIndex.get(c) >= left) {
            left = dupeIndex.get(c) + 1;
        }

        dupeIndex.put(c, right);

        maxCount = Math.max(maxCount, right - left + 1);
    }

    IO.println(maxCount);
}
