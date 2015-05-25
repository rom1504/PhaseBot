package xyz.jadonfowler.phasebot.cmd.fun;

import org.spacehq.packetlib.Session;

import xyz.jadonfowler.phasebot.PhaseBot;
import xyz.jadonfowler.phasebot.cmd.Command;

public class Swing extends Command {

	@Override
	public void exec(String in, String[] args, Session s) {
		PhaseBot.getBot().swing(s);
	}

	@Override
	public String getCommand() {
		return "swing";
	}

	@Override
	public String getDescription() {
		return "Swings the bot's arm.";
	}

}
