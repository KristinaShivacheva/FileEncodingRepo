import java.util.LinkedList;


public interface FileEncoder61687 {
	public void encode(String sourceFile, String destinationFile, LinkedList<Character> key);
	public void decode(String encodedFile, String destinationFile, LinkedList<Character> key);
}
