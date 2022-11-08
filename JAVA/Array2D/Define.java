package Array2D;

public class Define {
    public static void main(String[] args){

        // int marks[][] = new int[2][3];
        // marks[0][0] = 97;
        // marks[0][1] = 96;
        // marks[0][2] = 94;
        // marks[1][0] = 93;
        // marks[1][1] = 92;
        // marks[1][2] = 91;


            // Another way

        int marks[][] = {{99, 96, 94}, {93, 92 ,91}};

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
                System.out.print(marks[i][j] + " ");
        }
    }
}
