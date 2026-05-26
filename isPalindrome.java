void main() {
    String str = "Was it a car or a cat I saw??";

    String stripped = new StringBuilder(str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()).reverse().toString();
    IO.println(stripped);
    if (stripped.equals(str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase())) {
        IO.println("Yes");
    }
}
