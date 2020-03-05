package edu.cscc;

import org.junit.Assert;
import org.junit.Test;
//nothing i did made it work, everyhting kept breaking or throwing errors.
import static edu.cscc.RPSLSpock.*;

/**
 * Set of unit tests for RPSLSpock methods
 */
public class RPSLSpockTest {

    /**
     * Test isValidPick() method
     * Test that it returns true if argument is {rock,paper,scissors,lizard, or spock}
     * Test that it returns false if the argument is not a valid input String
     *
     */
    @Test
    public String isValidPick() {
        Assert.assertTrue(RPSLSpock.isValidPick(LIZARD));
        Assert.assertTrue(RPSLSpock.isValidPick(SPOCK));
        Assert.assertTrue(RPSLSpock.isValidPick(ROCK));
        Assert.assertTrue(RPSLSpock.isValidPick(PAPER));
        Assert.assertTrue(RPSLSpock.isValidPick(SCISSORS));

// , (SPOCK), (ROCK), (PAPER), (SCISSORS)
        // TODO remove this comment and verify the method returns false if passed and invalid argument like "banana"

        if (LIZARD = rand) {
            return true;
        }
        else if (SPOCK = rand) {
            return true;
        }
        else if (ROCK = rand) {
            return true;
        }
        else if (PAPER = rand) {
            return true;
        }
        else if (SCISSORS = rand) {
            return true
        }
        else {
            throw new IllegalArgumentException("Not the correct acception.");


    }


    /**
     * Test generatePick() method
     * Test that it returns a non-null String
     * Test that the String it returns is valid
     * Since the method is based on a RANDOM number - test it ONE MILLION times
     */
    @Test
    public void generatePick() {
        for (int i = 0; i < 1000000; ++i) {
            String pick = RPSLSpock.generatePick();
            Assert.assertNotNull(pick);
            Assert.assertTrue(RPSLSpock.isValidPick(pick));
        }
    }

    /**
     * Test the isComputerWin method
     * Test it with all ten possible computer win scenarios (it should return true)
     * Test it with at least one computer loses scenario to make sure it returns false
     */
    @Test
    public void isComputerWin() {
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK, RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK, LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER, RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER, SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(LIZARD, RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(LIZARD, SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(SPOCK, RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(SPOCK, RPSLSpock.SCISSORS));

        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, SPOCK));
    }
}
