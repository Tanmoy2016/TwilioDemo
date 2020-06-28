package com.tanmoy.example.twilio;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 * The Class SmsSender.
 */
public class SmsSender {

	/** The Constant ACCOUNT_SID. */
	public static final String ACCOUNT_SID = "AC80fd6aac2da8cfdd23ef17be86d7ee63";

	/** The Constant AUTH_TOKEN. */
	public static final String AUTH_TOKEN = "3405e8ee1d0d63c6fab7dae464a517b1";

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

		Message message = Message.creator(new PhoneNumber("+918013134857"), // to
				new PhoneNumber("+12015003621"), // from
				"Welocome to Twilio. This is a friendly message from Tanmoy").create();

		System.out.println(message.getSid());
	}
}
