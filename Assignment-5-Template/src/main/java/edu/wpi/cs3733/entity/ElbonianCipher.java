package edu.wpi.cs3733.entity;

/**
 * Elbonian cipher; you must implement the cipher and the observer pattern
 */
public class ElbonianCipher implements Observer {

	private String text;

	public void setText(String text) {
		this.text = text;
	}


	public String getText(){

		final int LOWERCASE_SHIFT = 96;
		final int UPPERCASE_SHIFT = 64;


		char[] letters = this.text.toCharArray();
		String encodedText = "";

		for (char letter : letters) {
			if (letter > 'z' && letter < 'a') {//lowercase letters
				letter = (char) ((int)letter - LOWERCASE_SHIFT);
			} else if (letter > 'Z' && letter < 'A') {//uppercase letters
				letter = (char) ((int)letter - UPPERCASE_SHIFT);
			} else {//non-letter char
				letter = letter;
			}

			encodedText += letter;
		}





		return null;
	}

	@Override
	public void notify(Object object){

	}
}
