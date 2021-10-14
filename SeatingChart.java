import java.util.List;

public class SeatingChart {
	
	private Student [][] seats;
	
	
	public SeatingChart (List <Student> studentList, int rows, int cols) {
		int co = 0;
		
		seats = new Student [rows][cols];
		
		for(int c = 0; c < cols; c++) {
			for(int r = 0; r < rows; r++) {
				seats [c][r] = studentList.get(co);
				co ++;
			}
		}
	}
	
	public int removeAbsentStudents (int allowedAbs) {
		int co = 0;
		
		for(int c = 0; c < seats[0].length; c++) {
			for(int r = 0; r < seats.length; r++) {
				
				if((seats [c][r]).getAbsenceCount() > allowedAbs) {
					seats [c][r] = null;
					co ++;
				}
				
			}
		}
		
		return co;
	}
	
	public boolean switchSeats (int RowA, int ColA, int RowZ, int ColZ) {
		if((seats[RowA][ColA] != null) || (seats[RowZ][ColZ] != null)) {
			Student a = new Student(seats[RowA][ColA].getName(), seats[RowA][ColA].getAbsenceCount());
			
			seats[RowA][ColA] = seats[RowZ][ColZ];
			seats[RowZ][ColZ] = a;
			
			return true;
		}
		return false;
	}
	
	public boolean isValidRow (int r) {
		if(r > 0 && r < seats.length) {
			return true;
		}
		return false;
	}
	
	public boolean isValidCol (int c) {
		if(c > 0 && c < seats[0].length) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		String out = "";
		for(int a = 0; a < seats.length; a++) {
			for(int b = 0; b < seats[0].length; b++) {
				out += (seats[a][b].getName() + ", " + seats[a][b].getAbsenceCount() + ", " + a + ", " + b);
			}
		}
		return out;
	}

}

