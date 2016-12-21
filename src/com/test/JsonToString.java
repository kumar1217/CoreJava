package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class JsonToString {

	public static void main(String[] args) throws IOException {
		File fin = new File("C:/Users/IBM_ADMIN/Downloads/JSON.txt");
		// System.out.println(fin);
		StringBuffer sbrr=readFile1(fin);
		System.out.println("encryptString" + sbrr.toString());
		System.out.println("encryptString       : " + encryptString(sbrr.toString()));	
	}

	private static StringBuffer readFile1(File fin) throws IOException {
		FileInputStream fis = new FileInputStream(fin);
		StringBuffer enc =new StringBuffer();
		// Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));

		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			
			enc.append(line);
			
			//System.out.println("encryptString" + encryptString(line));
		}

		br.close();
return enc;
	}

	public static String encryptString(String input) {
		StringBuffer sb = new StringBuffer();
		MessageDigest mDigest;
		try {
			mDigest = MessageDigest.getInstance("SHA1");
			byte[] result = mDigest.digest(input.getBytes());
			for (int i = 0; i < result.length; i++) {
				sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
			}
		} catch (NoSuchAlgorithmException e) {
			System.out.println(e.getMessage());
		}
		return sb.toString();
	}

}
