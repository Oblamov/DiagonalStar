
public class DiagonalStar {

	public static void printSquareStar(int number) {

		if (number < 5) {
			System.out.println("Invalid Value");
			
		}else {
		
		int currentRow = 0;
		int rowCount = number;
		int currentColumn = 0;
		
		for (int row = 1; row <= number; row++) {
			
			System.out.println();
			currentRow++;
			for (int column = 1; column <= number; column++) {
				currentColumn++;
				if(currentColumn == number - currentRow + 1 && row != number && row != 1 ) {
					System.out.print("*");
					continue;
				}
				if(currentColumn == currentRow || currentColumn == 1 || currentColumn == number) {
					System.out.print("*");
					continue;
				}
				if (row == 1 && currentColumn != currentRow) {
					System.out.print("*");
					continue;
				}
				if (row == number) {
					System.out.print("*");
					continue;
				}
				System.out.print(" ");
			}
			currentColumn = currentColumn - number;
		}
	}
	}
	public static void main(String[] args) {
		printSquareStar(5);

	}

}
