public static String MD5(String text) {
		try {
			java.security.MessageDigest hash = java.security.MessageDigest
					.getInstance("MD5");
			byte[] array = hash.digest(text.getBytes());
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < array.length; ++i) {
				sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100)
						.substring(1, 3));
			}
			return sb.toString();
		} catch (java.security.NoSuchAlgorithmException e) {
			return null;
		}
	}
