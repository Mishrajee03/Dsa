class Solution {
    public List<Integer> getRow(int rowIndex) {
       
    List<Integer> row = new ArrayList<>();

    long ans = 1;

    for (int r = 0; r <= rowIndex; r++) {
        row.add((int) ans);
        ans = ans * (rowIndex - r) / (r + 1);
    }

    return row;

    }
}