/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */
public class Percolation {
    private int[][] id;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        id = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                id[i][j] = 0;
            }
        }
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        id[row][col] = 1;
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        if (id[row][col] == 1) return true;
        return false;
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        if (id[row][col] == 0) return true;
        return false;
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        int c = 0;
        for (int i = 0; i < id.length; i++) {
            for (int j = 0; j < id[i].length; j++) {
                if (id[i][j] == 1) c++;
            }
        }
        return c;
    }

    // does the system percolate?
    public boolean percolates() {

    }
}
