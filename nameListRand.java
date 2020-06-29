import java.util.Random;
import java.util.Vector;
import javax.swing.*;

public class nameListRand {

	public static void main(String[] args) {
		Random rand = new Random(System.currentTimeMillis());
		
		int randNum = Math.abs(rand.nextInt() % 31);
		
		Vector  <String> nameList = new Vector <String> ();
		nameList.add("Shahbaz Singh Mansahia");
		nameList.add("Deep");
		nameList.add("Ahmed Mujtaba");
		nameList.add("Azeez Temitope Olanrewaju");
		nameList.add("Diming Chu");
		nameList.add("Dongshuo Li");
		nameList.add("Honorinicy");
		nameList.add("Jason");
		nameList.add("Junyu Liu");
		nameList.add("Kellyq Liu");
		nameList.add("Kinjan");
		nameList.add("Kun Li");
		nameList.add("Muhammed Umar");
		nameList.add("Oaz");
		nameList.add("PQ");
		nameList.add("Prithviatani");
		nameList.add("Richard");
		nameList.add("Sahil Singh Sandhu");
		nameList.add("Samuel Yang");
		nameList.add("Scott (Shih-Kai) Jhou");
		nameList.add("Shahriar Kabir");
		nameList.add("Shakur");
		nameList.add("Shrina Patel");
		nameList.add("Siyu Qiu");
		nameList.add("Siyulei");
		nameList.add("Sumid");
		nameList.add("abbytruong");
		nameList.add("Tao");
		nameList.add("Akshay Trivedi");
		nameList.add("Yan Huang");
		nameList.add("Saitong Zhao");
		
		String nameGenned = nameList.elementAt(randNum);
		System.out.println ("Hello");
		System.out.println ("Hello "+ nameList.size());
		System.out.println ("Hello "+ nameGenned);
		JOptionPane.showMessageDialog (null, nameGenned.toUpperCase() + " HAS JOINED THE BATTLE!", "A new Challenger Appears!", 1);
	}

}
