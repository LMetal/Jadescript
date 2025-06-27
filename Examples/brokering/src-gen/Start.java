import java.util.Scanner;
import jade.wrapper.ContainerController;
import jadescript.java.Jadescript;

public class Start {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int port = (int) (Math.random()*1000) + 10000;
			System.out.println(port);
			ContainerController container = Jadescript.newMainContainer(port);
			
		initiator.create(container, "initiator");
		broker.create(container, "broker");
		for(int i=0; i<3; i++){ //rimpiazza 3 con il numero di agenti richiesti
			Subagents.create(container, "Subagents"+Integer.toString(i));
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
