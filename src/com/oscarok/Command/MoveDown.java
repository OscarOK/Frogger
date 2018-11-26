package com.oscarok.Command;

import com.oscarok.Frog;

public class MoveDown implements Command {
    private Frog frog;

    public MoveDown(Frog frog) {
        this.frog = frog;
    }

    @Override
    public Frog execute() {
        return frog.move(0, Frog.SPEED);
    }
}
