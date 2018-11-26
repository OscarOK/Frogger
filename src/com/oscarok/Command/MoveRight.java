package com.oscarok.Command;

import com.oscarok.Frog;

public class MoveRight implements Command {
    private Frog frog;

    public MoveRight(Frog frog) {
        this.frog = frog;
    }

    @Override
    public Frog execute() {
        return frog.move(Frog.SPEED, 0);
    }
}
