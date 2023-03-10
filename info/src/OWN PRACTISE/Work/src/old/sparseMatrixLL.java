package old;


public class sparseMatrixLL {
    public static void main(String[] args) {
        {
            /* assume a 4*4 sparse matrix */
            int sparseMatrix[][] = {
                    { 0, 0, 1, 2 },
                    { 3, 0, 0, 0 },
                    { 0, 4, 5, 0 },
                    { 0, 6, 0, 0 },
            };
            Node start = null;
            Node tail = null;
            int k = 0;

            for (int i = 0; i < 4; i++)
                for (int j = 0; j < 4; j++) {
                    if (sparseMatrix[i][j] != 0) {
                        Node temp = new Node(i, j, sparseMatrix[i][j]);
                        temp.next = null;

                        if (start == null) {
                            start = temp;
                            tail = temp;

                        } else {
                            tail.next = temp;
                            tail = tail.next;
                        }
                    }
                }
            Node itr = start;

            while (start != null) {
                System.out.println(start.row + " " + start.col + " " + start.value);
                start = start.next;
            }
        }
    }
}
