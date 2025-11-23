package lab1_1 ;

import java.util.Scanner ;

public class lab1_14 {

    public static int countMine(char[][] map, int targetR, int targetC) {
        int count = 0 ;
        int row = map.length ;
        int column = map[0].length ;

        for (int i = targetR - 1; i <= targetR + 1; i++) {
            for (int j = targetC - 1; j <= targetC + 1; j++) {

                if (i == targetR && j == targetC) {
                    continue ;
                }

                if (i >= 0 && i < row && j >= 0 && j < column) {
                    if (map[i][j] == '*') {
                        count++ ;
                    }
                }
            }
        }
        return count ;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Minesweeper Logic") ;

            System.out.print("Please enter number of rows (positive integer): ") ;
            if (!input.hasNextInt()) {
                System.out.println("Input must be an integer!") ;
                return ;
            }
            int row = input.nextInt() ;
            if (row <= 0) {
                System.out.println("Number of rows must be greater than 0") ;
                return ;
            }

            System.out.print("Please enter number of columns (positive integer): ") ;
            if (!input.hasNextInt()) {
                System.out.println("Input must be an integer!") ;
                return ;
            }
            int column = input.nextInt() ;
            if (column <= 0) {
                System.out.println("Number of columns must be greater than 0") ;
                return ;
            }

            char[][] map = new char[row][column] ;
            System.out.println("Please enter the map using '*' (mine) or '.' (empty)") ;

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    while (true) {
                        System.out.print("Map[" + i + "][" + j + "] : ") ;
                        String s = input.next() ;
                        if (s.length() == 1 && (s.charAt(0) == '*' || s.charAt(0) == '.')) {
                            map[i][j] = s.charAt(0) ;
                            break ;
                        }else{
                            System.out.println("Please enter only '*' or '.'") ;
                        }
                    }
                }
            }

            System.out.print("Please enter Target Row (0 to " + (row - 1) + "): ") ;
            if (!input.hasNextInt()) {
                System.out.println("Input must be an integer!") ;
                return ;
            }
            int targetR = input.nextInt() ;

            System.out.print("Please enter Target Column (0 to " + (column - 1) + "): ") ;
            if (!input.hasNextInt()) {
                System.out.println("Input must be an integer!") ;
                return ;
            }
            int targetC = input.nextInt() ;

            if (targetR < 0 || targetR >= row || targetC < 0 || targetC >= column) {
                System.out.println("Target coordinates are out of bounds!") ;
                return ;
            }

            if (map[targetR][targetC] == '*') {
                System.out.println("Mine!!!") ;
            }else{
                int count = countMine(map, targetR, targetC) ;
                System.out.println("Mines around: " + count) ;
            }
        }
    }
}
