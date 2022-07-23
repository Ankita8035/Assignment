package TexalaAssignment1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicedataTest {

    @Test
    void loadingServiceData() {
        Servicedata s1 = new Servicedata();
        assertEquals(1, s1.loadingServiceData());
    }
}