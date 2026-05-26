void main() {
    List<Integer> nums = new ArrayList<>();

    Random ran = new Random();

    for (int i = 0; i < 10000000; i++) {
        nums.add(ran.nextInt(100));
    }
    long start1 = System.currentTimeMillis();
    int res2 = nums.stream().map(integer -> integer * 2).mapToInt(integer -> integer).sum();
    long end1 = System.currentTimeMillis();

    long start2 = System.currentTimeMillis();
    int res3 = nums.parallelStream().map(integer -> integer * 2).mapToInt(integer -> integer).sum();
    long end2 = System.currentTimeMillis();

    IO.println("seq " + res2 + " finished in " + (end1 - start1));
    IO.println("parallel " + res3 + " finished in " + (end2 - start2));
}
