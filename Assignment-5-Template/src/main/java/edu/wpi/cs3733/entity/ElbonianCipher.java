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

		for (char character : letters) {
			if (character > 'z' && character < 'a') {//lowercase letters
				character = (char) ((int)character - LOWERCASE_SHIFT);
			} else if (character > 'Z' && character < 'A') {//uppercase letters
				character = (char) ((int)character - UPPERCASE_SHIFT);
			} else {//non-character char
				character = character;
			}

			encodedText += character;
		}





		return null;
	}

	@Override
	public void notify(Object object){

	}
}
