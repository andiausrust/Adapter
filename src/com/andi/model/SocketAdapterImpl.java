package com.andi.model;

import com.andi.interfaces.SocketAdapter;

public class SocketAdapterImpl extends Socket implements SocketAdapter {



    @Override
    public Volt get120Volts() {
        return getVolt();
    }

    @Override
    public Volt get12Volts() {
        Volt v = get1Volt();
        return convertVolt(v, 10);
    }

    @Override
    public Volt get3Volts() {
        Volt v = get1Volt();
        return convertVolt(v, 40);
    }

    @Override
    public Volt get1Volt() {
        return get1Volt();
    }

    private Volt convertVolt(Volt v, int i){
        return new Volt(v.getVolts()/i);
    }
}
