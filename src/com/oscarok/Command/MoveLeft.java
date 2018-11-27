package com.oscarok.Command;

import com.oscarok.FrogComponents.Frog;

public class MoveLeft implements Command {
    private Frog frog;

    public MoveLeft(Frog frog) {
        this.frog = frog;
    }

    @Override
    public Frog execute() {
        return frog.move(-Frog.SPEED, 0);
    }
}
