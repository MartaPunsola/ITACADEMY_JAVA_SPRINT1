package n3exercici1;

import java.io.*;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class FileEncrypterDecrypter {
	
	private SecretKey secretKey;
    private Cipher cipher;
	
	public FileEncrypterDecrypter(String cipher) throws NoSuchPaddingException, NoSuchAlgorithmException {
    	this.secretKey = FileEncrypterDecrypter.generateKey(128);
        this.cipher = Cipher.getInstance(cipher);
    }
	
	public void encrypt(String content, String fileName) throws InvalidKeyException, IOException {
        this.cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] iv = this.cipher.getIV();

        try (
                FileOutputStream fileOut = new FileOutputStream(fileName);
                CipherOutputStream cipherOut = new CipherOutputStream(fileOut, this.cipher)
        ) {
            fileOut.write(iv);
            cipherOut.write(content.getBytes());
        }

    }
    
    public String decrypt(String fileName) throws InvalidAlgorithmParameterException, InvalidKeyException, IOException {
    	String line = "";
    	StringBuilder stringBuilder = new StringBuilder();

        try (FileInputStream fileIn = new FileInputStream(fileName)) {
            byte[] fileIv = new byte[16];
            fileIn.read(fileIv);
            this.cipher.init(Cipher.DECRYPT_MODE, this.secretKey, new IvParameterSpec(fileIv));

            try (
                    CipherInputStream cipherIn = new CipherInputStream(fileIn, this.cipher);
                    InputStreamReader inputReader = new InputStreamReader(cipherIn);
                    BufferedReader reader = new BufferedReader(inputReader)
            ) {

                while ((line = reader.readLine()) != null) {
                	stringBuilder.append(line).append(System.lineSeparator());
                }
                
            }

        }
        return stringBuilder.toString();
    }
    
    private static SecretKey generateKey(int n) throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(n);
        SecretKey key = keyGenerator.generateKey();
        return key;
    }
	
    public static IvParameterSpec generateIv() {
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        return new IvParameterSpec(iv);
    }

}
