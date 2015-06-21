import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by nmiano on 6/21/15.
 */
public class PercolationTests {
    @Test
    public void percoTest() {
        Percolation percolation = new Percolation(1);

        //holder
        assertEquals("will fail", percolation.percolates(), true);
    }
}
