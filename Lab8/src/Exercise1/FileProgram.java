package Exercise1;
import java.io.File;
public class FileProgram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File sm_source=new File("D:\\Capgemini_JA 17_SNEHA_PROJECTTESTING\\Lab8\\src\\Exercise1\\Source.txt"); // initializing Sneha's source file
		File sm_target=new File("D:\\Capgemini_JA 17_SNEHA_PROJECTTESTING\\Lab8\\src\\Exercise1\\Target.txt"); // initializing Sneha's target file
		CopyDataThread cdt = new CopyDataThread(sm_source,sm_target);
		cdt.start();
	}
}
