/**
 * 
 */
package sthiec.arithmetic;

/**
 * @author Lorhur
 * 
 */
public class ByteString {

	public static String getString(byte[] data) {
		StringBuilder sb = new StringBuilder();
		for (byte b : data)
			sb.append(String.format("%1$2X", b));
		return sb.toString();
	}

	public static byte[] getBytes(String bytestr) {
		byte[] bytes = new byte[bytestr.length()];
		for (int i = 0; i < bytes.length; i++)
			bytes[i] = (byte)Short.parseShort(bytestr.substring(i, 2), 16);
		return bytes;
	}

	
//	
//	public static int maskkkk(int shift) {
//		int mask = 1;
//		for (int i = 1; i < shift; i++)
//			mask = (mask << 1) + 1;
//		return mask;
//	}
//	
//	public static void main(String[] args) {
//		for (int x = 1; x <= 7; x++)
//			System.out.println(maskkkk(x));
//	}
}
