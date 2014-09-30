package dft.cisco.com.ciscodemologinapplication;

import android.test.ActivityUnitTestCase;

/**
 * Created by shrdeshp on 9/30/14.
 */
public class LoginActivityTest extends ActivityUnitTestCase{

    public LoginActivityTest(LoginActivity activity) {
        super(activity.getClass());
    }



    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    public void testActivity() throws Exception {

        final int expected = 1;
        final int reality = 5;
        assertEquals(expected, reality);

    }
}
