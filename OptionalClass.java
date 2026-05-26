void main() {
    List<String> names = Arrays.asList("Dharun", "Tharuniyaa");

    Optional<String> name = names.stream().filter(s -> s.contains("aa")).findFirst();

    if (name.isPresent()) {
        IO.println("Name found");
    } else {
        IO.println("No name");
    }
}
