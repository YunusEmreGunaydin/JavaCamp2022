package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String message = "Bugün hava çok güzel.";
		System.out.println(message);
		
		System.out.println("Eleman sayısı :"+message.length());
		System.out.println("5.Eleman :"+ message.charAt(4));
		System.out.println(message.concat(" Mükemmel..."));//Birleştirilmek için kullanılan metot.
		System.out.println(message.startsWith("i"));
		System.out.println(message.endsWith("."));
		char[] characters = new char[5];
		message.getChars(0, 5, characters, 0);
		System.out.println(characters);
		System.out.println(message.indexOf("d"));
		System.out.println(message.indexOf("a"));
		System.out.println(message.lastIndexOf("a"));
		
		/////////////
		
		System.out.println(message.replace('ü','u'));
		System.out.println(message.replace(' ', '*'));
		String newMessage = message.replace('ç', 'c');
		System.out.println(newMessage);
		
		
		System.out.println(message.substring(1,3));
		
		for(String message1 : message.split(" ")) {
			System.out.println(message1);
		}
		
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		
		System.out.println(message.trim());
		

	}

}
