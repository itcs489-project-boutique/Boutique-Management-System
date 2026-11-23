
package com.boutique.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;

class CiDemoFailTest {
    @Test
    void deliberateFailure() {
        fail("Deliberate failure to prove CI blocks bad PRs");
    }
}