package skippy.main.code;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * 
 * @author sasip
 *
 */

 @Data
public class Grid {
	 /**
	   * dimension of the grid.  
	   * 
	   * @param dimension New value for this grid's dimension.
	   * @return The current value of this grid's dimension.
	   */
	
	@Getter @Setter 
 	private int dimension;
	 

	public boolean liesOutside(final Point point) {
		return ((point.getX() < 0) || (point.getY() < 0) || (point.getX() > dimension) || (point.getY() > dimension));
	}
}
