
	import java.util.HashMap; 
	import java.util.Scanner; 
	
	public class PhoneBookApp { 
	   HashMap<String, Phone> map = new HashMap<String, Phone>(); 
	   Scanner sc = new Scanner(System.in); 
	   private int printMenu() { 
	      System.out.print("����:0, ����:1, ã��:2, ��ü����:3, ����:4>> "); 
	      return Integer.parseInt( sc.nextLine() ); 
	   } 
	   private void add() { 
	      System.out.print("�̸�>>"); 
	      String name = sc.nextLine(); 
	      if( map.containsKey(name) ) { 
	         System.out.println(name + "��(��) ��ϵ� ����Դϴ�."); 
	         return; 
	      } 
	      System.out.print("�ּ�>>"); 
	      String address = sc.nextLine(); 
	      System.out.print("��ȭ��ȣ>>"); 
	      String phoneNumber = sc.nextLine(); 
	      map.put(name, new Phone(name, address, phoneNumber)); 
	   } 
	   private void del() { 
	      System.out.print("�̸�>>"); 
	      String name = sc.nextLine(); 
	      if( !map.containsKey(name) ) { 
	         System.out.println(name + "��(��) ��ϵ��� ���� ����Դϴ�."); 
	         return ; 
	      } 
	      map.remove( name ); 
	      System.out.println(name + "��(��) �����Ǿ����ϴ�."); 
	   } 
	   private void search() { 
	      System.out.print("�̸�>>"); 
	      String name = sc.nextLine(); 
	      if( !map.containsKey(name) ) { 
	         System.out.println(name + "��(��) ��ϵ��� ���� ����Դϴ�."); 
	         return ; 
	      } 
	      System.out.println( map.get(name) ); 
	   } 
	   private void print() { 
	      for(String key : map.keySet() ) { 
	         System.out.println( map.get(key) ); 
	      } 
	   } 
	   public static void main(String[] args) { 
	      PhoneBookApp pba = new PhoneBookApp(); 
	      while( true ) { 
	         int choice = pba.printMenu(); 
	         if( choice == 4 ) { 
	            break; 
	            } else if( choice == 0 ) { 
	            pba.add(); 
	            } else if( choice == 1 ) { 
	            pba.del(); 
	            } else if( choice == 2 ) { 
	            pba.search(); 
	            } else if( choice == 3 ) { 
	            pba.print(); 
	         } 
	      } 
	      System.out.println("���α׷��� �����մϴ�..."); 
	   } 
	} 


