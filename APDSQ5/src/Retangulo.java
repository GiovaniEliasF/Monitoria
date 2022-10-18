import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Retangulo {
	public int Aa, Bb, Cc, Dd, A2, B2, C2, D2;
	
	public void Collision() {
		String path = "C:\\Users\\giova\\Downloads\\Atalhos\\EAJ\\2° Ano\\Técnico\\APDS\\2° Semestre\\Listas\\Testes.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while ((line) != null) {
				String[] b = line.split(" ");
				Aa = Integer.parseInt(b[0]);
				Bb = Integer.parseInt(b[1]);
				Cc = Integer.parseInt(b[2]);
				Dd = Integer.parseInt(b[3]);
				
				line = br.readLine();
				String[] h = line.split(" ");
				A2 = Integer.parseInt(h[0]);
				B2 = Integer.parseInt(h[1]);
				C2 = Integer.parseInt(h[2]);
				D2 = Integer.parseInt(h[3]);
				
				if (Cc < A2 || C2 < Aa || Dd < B2 || D2 < Bb || Aa > C2 || A2 > Cc || Bb > D2 || B2 > Dd) {
					System.out.println("Não Colidiu (0)");
				}else {
					System.out.println("Colidiu (1)");
				}
				
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
