/**
 * The Date class represents dates having a month, day, and year
 * 
 * @author M. Olan
 *
 */
public class Date {
	protected int month;
	protected int day;
	protected int year;
	
	/** Initialize this date with given month, day, and year
	 * @param month The month
	 * @param day The day
	 * @param year The year
	 */
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	/** Get the month
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/** Get the day
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/** Get the year
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return month + "/" + day + "/" + year;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Date))   // getClass() != obj.getClass())
			return false; 
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}	
	
}