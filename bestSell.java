void main() {
    int[] arr = {7, 6, 4, 3, 1};

    int minInd = 0;
    int maxDiff = 0;

    for (int i = 1; i < arr.length; i++) {
        int diff = arr[i] - arr[minInd];
        maxDiff = Math.max(diff, maxDiff);

        if (arr[minInd] > arr[i]) {
            minInd = i;
        }
    }

    if (maxDiff < 0) {
        IO.println(0);
    } else {
        IO.println(maxDiff);
    }
}