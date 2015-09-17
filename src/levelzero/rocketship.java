package levelzero;

import java.io.IOException;

public class rocketship {
public static void main(String[] args) throws IOException, InterruptedException {
	for (int i = 10; i >-1; i--) {
		System.out.println(i);
		Runtime.getRuntime().exec("say " +i).waitFor();
		
	}
	Runtime.getRuntime().exec("say BLAST OFF!");
}
}
