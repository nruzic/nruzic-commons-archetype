#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest
{
    App app;

    @BeforeEach
    void setUp() throws Exception
    {
        // Pre test initialization code
    }

    @AfterEach
    void tearDown() throws Exception
    {
        // Post test cleanup code
    }

    @Test
    void testApp() throws Exception
    {
        assertNull(this.app);
    }

}
