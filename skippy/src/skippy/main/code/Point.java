package skippy.main.code;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author sasip
 *
 */
@Data
public class Point {
	@Getter @Setter 
	private int x;
	@Getter @Setter 
	private int y;
	
	public Point() {
	}
	
	public Point(final int x,  final int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Point) {
			return (x == ((Point) o).x && y == ((Point) o).y);
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ") ";
	}

 
 
}
