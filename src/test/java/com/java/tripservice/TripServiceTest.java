package com.java.tripservice;

import com.java.tripservice.user.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripServiceTest {

    @Test
    void test() {
        try {
            new TripService().getTripsByUser(new User());
        } catch (Exception e) {
            fail("All tests would fail, because the singleton is accessed. Refactor to make the service testable.", e);
        }
    }
}