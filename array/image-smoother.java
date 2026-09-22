class Solution {
    public int[][] imageSmoother(int[][] img) {

        int rows = img.length;
        int cols = img[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                int sum = 0;
                int count = 0;

                // Check the 3 x 3 neighborhood
                for (int r = i - 1; r <= i + 1; r++) {
                    for (int c = j - 1; c <= j + 1; c++) {

                        // Make sure the cell exists
                        if (r >= 0 && r < rows && c >= 0 && c < cols) {
                            sum += img[r][c];
                            count++;
                        }
                    }
                }

                result[i][j] = sum / count;
            }
        }

        return result;
    }
}