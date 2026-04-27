package com.jad.show;

import com.jad.customer.ISpectator;
import com.jad.customer.Spectator;

public interface IShow {
    String getName();
    String getDescription();
    ShowType getShowType();

    void askToWatch(final ISpectator spectator);
}
