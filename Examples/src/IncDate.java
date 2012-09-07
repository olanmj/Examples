
public class IncDate extends Date {

	private int[] totalDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
	/** Initialize date with month, day, and year
	 * @param month The month
	 * @param day The day
	 * @param year The year
	 */
	public IncDate(int month, int day, int year) {
		super(month, day, year);
	}
	
	/** 
	 * Adds 1 day to this date
	 */
	public void increment() {
		day++;
		int endOfMonth = totalDays[month];
		if (month == 2 && year % 4 == 0) endOfMonth++;
		if (day > endOfMonth) {			
			day = 1;
			month++;
			if (month == 13) {
				month = 1;
				year++;
			}
		}
	}
}
