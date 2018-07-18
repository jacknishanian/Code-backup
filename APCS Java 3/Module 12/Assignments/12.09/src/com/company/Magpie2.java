package com.company;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}


		else if (statement.indexOf("where do you live") >= 0)
			response = "on your computer.";


		else if (statement.indexOf("How old are you") >= 0)
			response = "i was born on 2/9/17.";


		else if (statement.indexOf("how are you doing") >= 0)
			response = "very well.";


		else if (statement.indexOf("cat") >= 0 || statement.indexOf("dog") >= 0 )
			response = "tell me more about your pets.";


		else if (statement.indexOf("Rhonda ") >= 0 || statement.indexOf("Medford") >= 0 || statement.indexOf("Rhonda Medford") >= 0)
			response = "She sounds very knowledgeable.";


		else if (statement.indexOf("I want") >= 0)
			response = "why do you want that?";


		else if (statement.indexOf("understand ") >= 0)
			response = "to know is easy but to understand is harder";


		else if (statement.indexOf("like me") >= 0)
			response = "I am not capable of emotion yet";


		else if (statement.indexOf("confuse") >= 0)
			response = "what is confusing?";


		else if (statement.indexOf("you") >= 0)
			response = "why me?";


		else if (statement.indexOf("me") >= 0)
			response = "what about you?";


		else if (statement.indexOf("") >= 0)
			response = "So... are you going to say anything?";



		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 11;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}


		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}


		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}


		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}


		else if (whichResponse == 5)
		{
			response = "I dont understand.";
		}


		else if (whichResponse == 6)
		{
			response = "Come again?";
		}


		else if (whichResponse == 7)
		{
			response = "What???";
		}


		else if (whichResponse == 8)
		{
			response = "Please word it differently?";
		}


		else if (whichResponse == 9)
		{
			response = "i cannot understand this?";
		}


		else if (whichResponse == 10)
		{
			response = "huh?";
		}
		return response;
	}


		/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no").
	 *
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @param startPos
	 *            the character of the string to begin the
	 *            search at
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal,
			int startPos)
	{
		String phrase = statement.trim();
		// The only change to incorporate the startPos is in
		// the line below
		int psn = phrase.toLowerCase().indexOf(
				goal.toLowerCase(), startPos);

		// Refinement--make sure the goal isn't part of a
		// word
		while (psn >= 0)
		{
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn)
						.toLowerCase();
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(
						psn + goal.length(),
						psn + goal.length() + 1)
						.toLowerCase();
			}

			// If before and after aren't letters, we've
			// found the word
			if (((before.compareTo("a") < 0) || (before
					.compareTo("z") > 0)) // before is not a
											// letter
					&& ((after.compareTo("a") < 0) || (after
							.compareTo("z") > 0)))
			{
				return psn;
			}

			// The last position didn't work, so let's find
			// the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(),
					psn + 1);
		}

		return -1;
	}

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no"). The search
	 * begins at the beginning of the string.
	 *
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	public int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

}
