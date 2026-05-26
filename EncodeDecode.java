void main() {
    List<String> test = Arrays.asList("", "");

    String encoded = encode(test);

    IO.println(encoded);

    List<String> decoded = decode(encoded);
    IO.println(decoded);
}

static String encode(List<String> test) {
    StringBuilder sb = new StringBuilder();
    for (String str : test) {
        sb.append(str.length()).append("#").append(str);
    }
    return sb.toString();
}

static List<String> decode(String encoded) {
    int i = 0;
    List<String> result = new ArrayList<>();
    while (i < encoded.length()) {
        int separator = encoded.indexOf('#', i);
        int len = Integer.parseInt(encoded.substring(i, separator));

        i = separator + 1;

        result.add(encoded.substring(i, i + len));

        i += len;
    }
    return result;
}
