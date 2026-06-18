package com.limelight.binding.input.capture

import org.junit.Assert.assertEquals
import org.junit.Test

class TouchpadCompatibilityStoreTest {
    @Test
    fun roundTripsCompatibleDevices() {
        val device = TouchpadCompatibilityDevice(
            descriptor = "f00491ba03d7579d098dc32bbb0c03a8babdda3d",
            vendorId = 0x17ef,
            productId = 0x61ba,
            name = "Lenovo Keyboard Pack For Yoga Tab Touchpad"
        )

        assertEquals(
            listOf(device),
            TouchpadCompatibilityStore.decode(
                TouchpadCompatibilityStore.encode(listOf(device))
            )
        )
    }
}
