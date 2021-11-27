package baseball;

import baseball.validator.GameInputValidator;
import baseball.validator.PlayOrStopInputValidator;

public class Config {

	GameInputValidator gameInputChecking = new GameInputValidator();

	PlayOrStopInputValidator playOrStopInputChecking = new PlayOrStopInputValidator();

	RandomNumberGenerator randomNumber = new RandomNumberGenerator();

	BallStrikeCalculator ballStrikeCalculator = new BallStrikeCalculator();
}
