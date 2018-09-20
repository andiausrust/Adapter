package com.andi.interfaces;

import com.andi.model.Volt;

public interface SocketAdapter {

    Volt get120Volts();

    Volt get12Volts();

    Volt get3Volts();

    Volt get1Volt();
}
