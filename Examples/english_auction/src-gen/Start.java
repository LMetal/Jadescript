import java.util.Scanner;
import jade.wrapper.ContainerController;
import jadescript.java.Jadescript;

public class Start {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int port = (int) (Math.random()*1000) + 10000;
			System.out.println(port);
			ContainerController container = Jadescript.newMainContainer(port);
			
		auctioneer.create(container, "auctioneer");
		for(int i=0; i<3; i++){ //rimpiazza 3 con il numero di agenti richiesti
			Bidders.create(container, "Bidders"+Integer.toString(i));
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
