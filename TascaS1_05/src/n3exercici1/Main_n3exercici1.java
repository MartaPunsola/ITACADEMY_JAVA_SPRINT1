package n3exercici1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.NoSuchPaddingException;

public class Main_n3exercici1 {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
		// TODO Auto-generated method stub
		
		String originalContent = "", decryptedContent = "";
		
		FileEncrypterDecrypter fileEncrypterDecrypter = new FileEncrypterDecrypter("AES/CBC/PKCS5Padding");
		
		originalContent = readFile("src/n3exercici1/DirectoryTree.txt");
		
		fileEncrypterDecrypter.encrypt(originalContent, "src/n3exercici1/DirectoryTreeCyphered.txt");
		
		decryptedContent = fileEncrypterDecrypter.decrypt("src/n3exercici1/DirectoryTreeCyphered.txt");
		System.out.println("Decyphered content:\n" + decryptedContent);
		
	}
	
	private static String readFile(String filePath) {
        String line = "";
		StringBuilder stringBuilder = new StringBuilder();
		
		try {
        	BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        	while ((line = bufferedReader.readLine()) != null) {
        		stringBuilder.append(line).append(System.lineSeparator());
            }
            bufferedReader.close();
            
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getClass().getName());
        }
        
        return stringBuilder.toString();	
    }

}
