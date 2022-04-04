
public class App {

	public static void main(String[] args) {
		// learning "break" statement
		// Using a label on a break statement in a nested loop, or 
		// not using the break statement at all, can cause the loop structure
		// to behave quite DIFFERENTLY.
		
		int[][] list = {{1,13},{5,2},{2,2}};
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		
		//EXAMPLE 1
		// output (1,1)
		PARENT_LOOP: for(int i=0; i<list.length; i++) {
			for (int j=0; j<list[i].length; j++) {
				if(list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					//this statement will break out of the entire loop structure
					//as soon as the first matching value is found.
					break PARENT_LOOP;
				}
			}
		}
		
		if (positionX == -1 || positionY == -1) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX+ "," + positionY + ")" );	
		}

		//EXAMPLE 2
		// output (2,0)
		PARENT_LOOP: for(int i=0; i<list.length; i++) {
			System.out.println("list length: " + list.length);
			
			for (int j=0; j<list[i].length; j++) {
				System.out.println("list [" + i + "] length: " + list[i].length);
				if(list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					//only exit the inner loop when the condition is met.
					break;
				}
			}
		}
		
		if (positionX == -1 || positionY == -1) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX+ "," + positionY + ")" );	
		}
		
		//EXAMPLE 3
		//output (2,1)
		PARENT_LOOP: for(int i=0; i<list.length; i++) {
			for (int j=0; j<list[i].length; j++) {
				if(list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					//what would happen if we remove "break" statement
					//the code will search for the last value in the entire structure that has
					//the matching value. 
				}
			}
		}
		
		if (positionX == -1 || positionY == -1) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX+ "," + positionY + ")" );	
		}


		
	}

}
