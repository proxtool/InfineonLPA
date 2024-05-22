/**
 * This class file was automatically generated by jASN1 v1.11.3 (http://www.beanit.com)
 */

package com.gsma.sgp.messages.pkix1explicit88;

import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.io.Serializable;
import com.beanit.jasn1.ber.*;
import com.beanit.jasn1.ber.types.*;
import com.beanit.jasn1.ber.types.string.*;


public class X520OrganizationalUnitName implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	private BerTeletexString teletexString = null;
	private BerPrintableString printableString = null;
	private BerUniversalString universalString = null;
	private BerUTF8String utf8String = null;
	private BerBMPString bmpString = null;
	
	public X520OrganizationalUnitName() {
	}

	public X520OrganizationalUnitName(byte[] code) {
		this.code = code;
	}

	public void setTeletexString(BerTeletexString teletexString) {
		this.teletexString = teletexString;
	}

	public BerTeletexString getTeletexString() {
		return teletexString;
	}

	public void setPrintableString(BerPrintableString printableString) {
		this.printableString = printableString;
	}

	public BerPrintableString getPrintableString() {
		return printableString;
	}

	public void setUniversalString(BerUniversalString universalString) {
		this.universalString = universalString;
	}

	public BerUniversalString getUniversalString() {
		return universalString;
	}

	public void setUtf8String(BerUTF8String utf8String) {
		this.utf8String = utf8String;
	}

	public BerUTF8String getUtf8String() {
		return utf8String;
	}

	public void setBmpString(BerBMPString bmpString) {
		this.bmpString = bmpString;
	}

	public BerBMPString getBmpString() {
		return bmpString;
	}

	public int encode(OutputStream reverseOS) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				reverseOS.write(code[i]);
			}
			return code.length;
		}

		int codeLength = 0;
		if (bmpString != null) {
			codeLength += bmpString.encode(reverseOS, true);
			return codeLength;
		}
		
		if (utf8String != null) {
			codeLength += utf8String.encode(reverseOS, true);
			return codeLength;
		}
		
		if (universalString != null) {
			codeLength += universalString.encode(reverseOS, true);
			return codeLength;
		}
		
		if (printableString != null) {
			codeLength += printableString.encode(reverseOS, true);
			return codeLength;
		}
		
		if (teletexString != null) {
			codeLength += teletexString.encode(reverseOS, true);
			return codeLength;
		}
		
		throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
	}

	public int decode(InputStream is) throws IOException {
		return decode(is, null);
	}

	public int decode(InputStream is, BerTag berTag) throws IOException {

		int codeLength = 0;
		BerTag passedTag = berTag;

		if (berTag == null) {
			berTag = new BerTag();
			codeLength += berTag.decode(is);
		}

		if (berTag.equals(BerTeletexString.tag)) {
			teletexString = new BerTeletexString();
			codeLength += teletexString.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerPrintableString.tag)) {
			printableString = new BerPrintableString();
			codeLength += printableString.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerUniversalString.tag)) {
			universalString = new BerUniversalString();
			codeLength += universalString.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerUTF8String.tag)) {
			utf8String = new BerUTF8String();
			codeLength += utf8String.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerBMPString.tag)) {
			bmpString = new BerBMPString();
			codeLength += bmpString.decode(is, false);
			return codeLength;
		}

		if (passedTag != null) {
			return 0;
		}

		throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
		encode(reverseOS);
		code = reverseOS.getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		if (teletexString != null) {
			sb.append("teletexString: ").append(teletexString);
			return;
		}

		if (printableString != null) {
			sb.append("printableString: ").append(printableString);
			return;
		}

		if (universalString != null) {
			sb.append("universalString: ").append(universalString);
			return;
		}

		if (utf8String != null) {
			sb.append("utf8String: ").append(utf8String);
			return;
		}

		if (bmpString != null) {
			sb.append("bmpString: ").append(bmpString);
			return;
		}

		sb.append("<none>");
	}

}

